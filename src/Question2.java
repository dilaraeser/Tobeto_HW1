import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter amount which you want to buy:");

        int productCount  = scanner.nextInt();
        int totalOrderAmount=0;
        for(int i=0; i<productCount; i++){
            System.out.println("Please enter product price:");
            int productPrice  = scanner.nextInt();
            System.out.println("Please enter product quantity:");
            int quantity  = scanner.nextInt();
            totalOrderAmount = totalOrderAmount + (productPrice*quantity);
        }
        System.out.println("Total amount of this order: " + totalOrderAmount);

    }
}
