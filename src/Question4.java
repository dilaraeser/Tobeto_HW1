import java.util.Random;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Random r = new Random();
        int low = 1;
        int high = 10;
        int number = r.nextInt(high-low) + low;
        int guessNumber=0;
        while(number!=guessNumber) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please guess the number: ");
            guessNumber = scanner.nextInt();
        }

        System.out.println("Congratulations! Number was: " + number);
    }
}
