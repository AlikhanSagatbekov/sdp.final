public class OrderContext {
    private DeliveryStrategy deliveryStrategy;

    public OrderContext(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public void processOrder(Order order) {
        // Логика обработки заказа
        deliveryStrategy.deliver(order);
    }
}
