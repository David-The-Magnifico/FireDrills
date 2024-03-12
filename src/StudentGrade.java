import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;
public class StudentGrade {
    Scanner input = new Scanner(System.in);
    private String enterGrades;
    private String studentName;
    private int subject1;
    private int subject2;
    private int subject3;
    private int total;
    private double average;
    private int position;

    public StudentGrade(String name, int subject1, int subject2, int subject3, int total, double avg, int pos){
        this.studentName = name;
        this.subject1 =subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.total = total;
        this.average = avg;
        this.position = pos;
    }

    public String toString(){
        return "\t" + studentName + "\t\t" + subject1 + "\t\t" + subject2 + "\t\t" + subject3 + "\t\t" + total + "\t\t" + average + "\t\t" + position;
    }

    public void setStudentName(String name){this.studentName = name;}
    public String getStudentName(){ return studentName; }

    public void setFirstSub(int sub){this.subject1 = sub;}
    public int getFirstSub(){return  subject1;}

    public void setSecondSub(int sub){this.subject2 = sub;}
    public int getSecondSub(){return  subject2;}

    public void setThirdSub(int sub){this.subject3 = sub;}
    public int getThirdSub(){return  subject3;}

    public void setTotal(int totalGrades){this.total = totalGrades; }
    public int getTotal(){return total;}

    public void setAverage(int avg){this.average = avg;}
    public double getAverage(){return average;}

    public void setPosition(int pos){this.position = pos;}
    public int getPosition(){
        return position;}

    public void studentTable() {
        ArrayList<StudentGrade> myStudents = new ArrayList<>();
        StudentGrade students = new StudentGrade("John", 10, 20, 30, 60, 30, 1);
        int subjectOneTotal = 0;
        int subjectOneAverage = 0;
        int countPasses = 0;
        int countFailures = 0;

        String doubleLine = "=============================================================";

        do {
            System.out.println();
            System.out.print("Enter Student name: ");
            String studentNames = input.nextLine();
            students.setStudentName(studentNames);

            System.out.print("ENTER GRADES FOR SUBJECT 1: ");
            int gradesA = input.nextInt();
            students.setFirstSub(gradesA);

            subjectOneTotal += gradesA;

            System.out.print("ENTER GRADES FOR SUBJECT 2: ");
            int gradesB = input.nextInt();
            students.setSecondSub(gradesB);

            System.out.print("ENTER GRADES FOR SUBJECT 3: ");
            int gradesC = input.nextInt();
            students.setThirdSub(gradesC);

            int totalGrades = gradesA + gradesB + gradesC;
            int averages = totalGrades / 3;

            students.setTotal(totalGrades);
            students.setAverage(averages);

            myStudents.add(new StudentGrade(studentNames, gradesA, gradesB, gradesC, totalGrades, averages, position));
            System.out.println(doubleLine);
            System.out.printf("%S\t\t\t%S\t\t%S\t%S\t%S\t%S\t\t%S\n", "student", "subject1", "subject2", "subject3", "total", "average", "positon");
            System.out.println(doubleLine);

            myStudents.sort(Comparator.comparing(a -> -a.average));

            int count = 1;
            for (StudentGrade tables : myStudents ) {
                tables.setPosition(count++);
                System.out.println(tables);
            }

            System.out.println(doubleLine);
            System.out.println(doubleLine);

            System.out.print("Keep entering grades? ");
            input.nextLine();
            enterGrades = input.nextLine();

        }while (Objects.equals(enterGrades, "yes"));

        System.out.println("SUBJECT SUMMARY");
        System.out.println("SUBJECT 1");

        System.out.print("Highest scoring student is: ");
        StudentGrade maxValue = myStudents.stream().max(Comparator.comparing(StudentGrade::getFirstSub)).get();
        System.out.println(maxValue.studentName + " Scoring " + maxValue.subject1);

        System.out.print("Lowest scoring student is: ");
        StudentGrade minValue = myStudents.stream().min(Comparator.comparing(StudentGrade::getFirstSub)).get();
        System.out.println(minValue.studentName + " Scoring " + minValue.subject1);

        int avgScore = subjectOneTotal / myStudents.size();

        System.out.print("Average score is: ");
        System.out.println(avgScore);

        System.out.print("Total score is: ");
        System.out.println(subjectOneTotal);

        if(maxValue.subject1 > 50){
            countPasses +=1;
            int passes = countPasses;
            System.out.println("Number of passes: " + ++countPasses);
        }
        if(maxValue.subject1 < 50){ System.out.print("Number of failures: " + ++countFailures);}
    }
}
