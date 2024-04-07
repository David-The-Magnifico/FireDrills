import java.util.Scanner;

public class CreditCardValidator {
    static Scanner scanner = new Scanner(System.in);

    public static void creditCardValidator() {
        System.out.println("Hello, kindly enter credit card details to verify:");
        String creditCard = scanner.nextLine();

        if (isValidCreditCardLength(creditCard)) {
            int sumEvenAndOdd = calculateSumEvenAndOdd(creditCard);

            String validType = (sumEvenAndOdd % 10 == 0) ? "Valid Card" : "Invalid Card";
            String cardType = determineCardType(creditCard);

            printValidationResults(creditCard, validType, cardType);
        } else {
            System.out.println("Invalid Card Length. Please enter a valid credit card number.");
        }
    }

    private static boolean isValidCreditCardLength(String creditCard) {
        return creditCard.length() >= 13 && creditCard.length() <= 16;
    }

    private static int calculateSumEvenAndOdd(String creditCard) {
        int evenTotal = 0, oddTotal = 0;
        for (int i = creditCard.length() - 1; i >= 0; i--) {
            int num = Integer.parseInt(String.valueOf(creditCard.charAt(i)));
            if (i % 2 == 0) {
                int favour = num * 2;
                evenTotal += (favour > 9) ? (favour % 10 + favour / 10) : favour;
            } else {
                oddTotal += num;
            }
        }
        return evenTotal + oddTotal;
    }

    private static String determineCardType(String creditCard) {
        char firstDigit = creditCard.charAt(0);
        if (firstDigit == '4') {
            return "Visa Card";
        } else if (firstDigit == '5') {
            return "Master Card";
        } else if (firstDigit == '3' || firstDigit == '7') {
            return "Discover Card";
        } else {
            return "Invalid Card";
        }
    }

    private static void printValidationResults(String creditCard, String validType, String cardType) {
        int length = creditCard.length();
        System.out.println("**********************************\n" +
                "**Card Type Is: " + cardType + "\n" +
                "**Card Number Is: " + creditCard + "\n" +
                "**Card Digit Length: " + length + "\n" +
                "**Card Validity Status: " + validType + "\n" +
                "*************************************************");
    }

    public static void main(String[] args) {
        creditCardValidator();
    }
}
