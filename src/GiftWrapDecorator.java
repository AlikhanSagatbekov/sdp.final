public class GiftWrapDecorator implements OrderDecorator {
    @Override
    public void decorate(Order order) {
        System.out.println("Заказ упакован в подарочную упаковку.");
        // Логика упаковки в подарочную упаковку
    }
}
