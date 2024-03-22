package Home006;

import java.util.Scanner;

public class OrderProcessor {

    public static void inputOrderDetails(Order order) {
        Scanner input = new Scanner(System.in);
        System.out.print("Client name: ");
        order.setClientName(input.nextLine());
        System.out.print("Product: ");
        order.setProduct(input.nextLine());
        System.out.print("Quantity: ");
        order.setQnt(Integer.parseInt(input.nextLine()));
        System.out.print("Price: ");
        order.setPrice(Integer.parseInt(input.nextLine()));
    }
}