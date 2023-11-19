public class ExpressDeliveryStrategy implements DeliveryStrategy {
    @Override
    public void deliver(Order order) {
        System.out.println("Заказ доставляется экспресс-доставкой.");
        // Логика экспресс-доставки
    }
}
