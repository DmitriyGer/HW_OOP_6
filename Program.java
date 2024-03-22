package Home006;

public class Program {

    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        OrderProcessor.inputOrderDetails(order);
        OrderJsonSaver.saveOrderToJson(order);
    }
}