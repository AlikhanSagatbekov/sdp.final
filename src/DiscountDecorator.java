public class DiscountDecorator implements OrderDecorator {
    @Override
    public void decorate(Order order) {
        System.out.println("Применена скидка к заказу.");
        // Логика применения скидки
    }
}
