import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int total = 0;

        System.out.print("Please enter a number: ");
        int number = scan.nextInt();

        for(int i = 1; i < number; i++)
        {
            if(number % i == 0) {
                total += i;
            }
        }
        if(number == total) {
            System.out.println(number + " is a perfect number.");
        }
        else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
