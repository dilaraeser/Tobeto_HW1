import java.util.HashMap;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        HashMap<String, String> orderProductMap = createOrderProductMap();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an order id: ");

        String orderId = scanner.nextLine();

        switch (orderId){
            case "1":
                System.out.println(orderProductMap.get("1"));
                break;
            case "2":
                System.out.println(orderProductMap.get("2"));
                break;
            case "3":
                System.out.println(orderProductMap.get("3"));
                break;
            case "4":
                System.out.println(orderProductMap.get("4"));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + orderId);
        }

    }

    public static HashMap<String, String> createOrderProductMap(){
        HashMap<String, String> orderProductMap = new HashMap<String,String>();
        orderProductMap.put("1","Phone");
        orderProductMap.put("2","Computer");
        orderProductMap.put("3","Desk");
        orderProductMap.put("4","Fridge");
        return orderProductMap;
    }


}
