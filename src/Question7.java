import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter student count: ");
        int totalStudentCount = scan.nextInt();

        for(int i = 0; i < totalStudentCount; i++) {
            System.out.print("Please enter student name: ");
            String studentName = scan.next();
            System.out.print("Please enter student surname: ");
            String studentSurname = scan.next();

            System.out.print("Please enter first exam point: ");
            int firstExamPoint = scan.nextInt();

            System.out.print("Please enter second exam point: ");
            int secondExamPoint = scan.nextInt();

            System.out.print("Please enter third exam point: ");
            int thirdExamPoint = scan.nextInt();

            System.out.print("Average point of exam for " + studentName + " " + studentSurname + ": " + (firstExamPoint + secondExamPoint + thirdExamPoint)/3 +"\n");

        }

    }
}
