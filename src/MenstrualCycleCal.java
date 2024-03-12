import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualCycleCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name:");
        String name = scanner.nextLine();

        System.out.println("Enter your Cycle length:");
        int cycleLength = scanner.nextInt();

        System.out.println("Generate flow report for how many month:");
        int months = scanner.nextInt();

        System.out.println("Date of last flow (in the format of DD/MM/YYYY):");
        scanner.nextLine();
        String inputDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate lastFlowDate = LocalDate.parse(inputDate, formatter);

        System.out.println("Do you want to see your Flow Report (Yes/No)?:");
        String showReport = scanner.nextLine();

        if (showReport.equalsIgnoreCase("Yes")) {
            System.out.println("Please wait while we generate your flow report......");
            System.out.println();
            System.out.println("Loading >>>>>>>>>>>>>>>>>>>>>>");
            System.out.println();
            System.out.println("=====================================");
            System.out.println("Flow report is loaded successfully!!!");
            System.out.println("=====================================");
            System.out.println();
            System.out.println("             FLOW REPORT                  ");
            System.out.println("==========================================");
            System.out.println();

            LocalDate nextFlowDate = lastFlowDate.plusDays(cycleLength);
            System.out.println("Next Flow Date: " + nextFlowDate.format(formatter));

            LocalDate ovulationDate = lastFlowDate.plusDays(cycleLength - 14);
            System.out.println("Ovulation Date: " + ovulationDate.format(formatter));

            LocalDate fertileStart = ovulationDate.minusDays(3);
            LocalDate fertileEnd = ovulationDate.plusDays(4);
            System.out.println("Fertile Period: " + fertileStart.format(formatter) + " to " + fertileEnd.format(formatter));

