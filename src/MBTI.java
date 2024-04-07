import java.util.Scanner;

public class MBTI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int extrovertCount = 0;
        int introvertCount = 0;
        int sensitiveCount = 0;
        int intuitiveCount = 0;
        int thinkerCount = 0;
        int feelerCount = 0;
        int judgingCount = 0;
        int prospectiveCount = 0;
        int[] answers;

        String[] questions = new String[]{

                "A. Expend energy, enjoy groups.                                    B. Conserve energy, one-on-one",
                "A. Interpret literally.                                            B. Look for meaning and possibilities",
                "A. Logical, thinking, questioning.                                 B. Empathetic, feeling, accommodating",
                "A. Organized, orderly.                                             B. Flexible, adaptable",
                "A. More outgoing, think out loud.                                  B. More reserved, think to yourself.",
                "A. Practical, realistic, experiential.                             B. Imagination, innovative, theoretical.",
                "A. Candid, straight forward, frank.                                B. Tactful, kind, encouraging.",
                "A. Plan, schedule.                                                 B. Unplanned, spontaneous",
                "A. Seek many tasks, public activities, interaction with others.    B. Seek private, solitary activities with quiet to concentrate.",
                "A. Standard, usual, conventional.                                  B. Different, novel, unique.",
                "A. Firm, tend to criticize, hold the line.                         B. Gentle, tend to appreciate, conciliate.",
                "A. Regulated, structured.                                          B. Easygoing, live and let live.",
                "A. External, communicative, express yourself.                      B. Internal, reticent, keep to yourself.",
                "A. Focus on here-and-now.                                          B. Look to the future, global perspective, big picture",
                "A. Tough minded, just.                                             B. Tender-hearted, merciful",
                "A. Preparation, plan ahead.                                        B. Go with the flow, adapt as you go.",
                "A. Active, initiate.                                               B. Reflective, deliberate",
                "A. Facts, things, what is.                                         B. Ideas, dreams, 'what could be', philosophical",
                "A. Matter of fact, issue oriented.                                 B. Sensitive, people-oriented, compassionate",
                "A. Control, govern.                                                B. Latitude, freedom",
        };
        int[] userResponses = new int[questions.length];
        System.out.print("What is your name: ");
        String userName = scanner.nextLine();

        for (int response = 0; response < questions.length; ) {
            userResponses[response] = askQuestion(questions[response], scanner);
            if(userResponses[response] == 1) response++;
            else System.out.println("WARNING!!, this is an error,try again");

        }

        System.out.print("\n" + userName + ", your personality type is: ");
        String personalityType = checkPersonalityType(userResponses);
        System.out.println(personalityType);

    }

    public static int askQuestion(String question, Scanner scan) {
        System.out.println(question);
        System.out.print("A or B: ");
        String response = scan.nextLine();
        return (response.equalsIgnoreCase("A") || response.equalsIgnoreCase("B")) ?1:2;

    }




    private static String checkPersonalityType(int[] userResponses) {
        String personalityType = "";
        personalityType += extrovertOrIntrovert(userResponses[0], userResponses[1]);
        personalityType += sensitiveOrIntuitive(userResponses[2], userResponses[3]);
        personalityType += thinkerOrFeeler(userResponses[4], userResponses[5]);
        personalityType += judgingOrProspective(userResponses[6], userResponses[7]);

        return personalityType;
    }


    public static void questions(String answers) {
        for (int counter = 0; counter < answers.length() + 4; counter++) {

        }
    }

    private static String extrovertOrIntrovert(int extrovertCount, int introvertCount) {
        return (extrovertCount > introvertCount) ? "I" : "E";

    }

    private static String sensitiveOrIntuitive(int sensitiveCount, int intuitiveCount) {
        return (sensitiveCount > intuitiveCount) ? "I" : "S";
    }


    private static String thinkerOrFeeler(int thinkerCount, int feelerCount) {
        return (thinkerCount > feelerCount) ? "F" : "T";
    }


    private static String judgingOrProspective(int judgingCount, int perspectiveCount) {
        return (judgingCount > perspectiveCount) ? "P" : "J";
    }
    public static void printAnswers(){

    }



}