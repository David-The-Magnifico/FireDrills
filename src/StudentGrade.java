import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentGrade {
    private String studentName;
    private int subject1;
    private int subject2;
    private int subject3;
    private int total;
    private double average;
    private int position;

    public StudentGrade(String studentName, int subject1, int subject2, int subject3, int total, double average, int position) {
        this.studentName = studentName;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.total = total;
        this.average = average;
        this.position = position;
    }

    public String toString() {
        return String.format("\t%s\t\t%d\t\t%d\t\t%d\t\t%d\t\t%.2f\t\t%d", studentName, subject1, subject2, subject3, total, average, position);
    }

    public static void main(String[] args) {
        StudentGrade studentGrade = new StudentGrade("John", 10, 20, 30, 60, 30, 1);
        studentGrade.studentTable();
    }

    public void studentTable() {
        Scanner input = new Scanner(System.in);
        ArrayList<StudentGrade> myStudents = new ArrayList<>();

        do {
            System.out.println();
            System.out.print("Enter Student name: ");
            String studentName = input.nextLine();

            int subject1 = getGrade("ENTER GRADES FOR SUBJECT 1: ", input);
            int subject2 = getGrade("ENTER GRADES FOR SUBJECT 2: ", input);
            int subject3 = getGrade("ENTER GRADES FOR SUBJECT 3: ", input);

            int total = subject1 + subject2 + subject3;
            double average = total / 3.0;

            myStudents.add(new StudentGrade(studentName, subject1, subject2, subject3, total, average, position));

            displayStudentTable(myStudents);

            System.out.print("Keep entering grades? ");
        } while (input.nextLine().equalsIgnoreCase("yes"));

        input.close();
    }

    private static int getGrade(String message, Scanner input) {
        System.out.print(message);
        return input.nextInt();
    }

    private void displayStudentTable(ArrayList<StudentGrade> students) {
        String doubleLine = "=============================================================";
        System.out.println(doubleLine);
        System.out.printf("%S\t\t\t%S\t\t%S\t%S\t%S\t%S\t\t%S\n", "student", "subject1", "subject2", "subject3", "total", "average", "position");
        System.out.println(doubleLine);

        Collections.sort(students, (a, b) -> Double.compare(b.average, a.average));

        int count = 1;
        for (StudentGrade student : students) {
            student.setPosition(count++);
            System.out.println(student);
        }

        System.out.println(doubleLine);
        System.out.println(doubleLine);
    }

    private void setPosition(int position) {
        this.position = position;
    }
}
