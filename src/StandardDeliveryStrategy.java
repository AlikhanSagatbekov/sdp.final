public class StandardDeliveryStrategy implements DeliveryStrategy {
    @Override
    public void deliver(Order order) {
        System.out.println("Заказ доставляется стандартной доставкой.");
        // Логика стандартной доставки
    }
}
