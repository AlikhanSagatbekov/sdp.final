public class Main {

    public static void main(String[] args) {
        // Singleton
        DatabaseManager databaseManager = DatabaseManager.getInstance();

        // Factory Method
        MedicationFactory antibioticFactory = new AntibioticFactory();
        MedicationFactory painkillerFactory = new PainkillerFactory();

        Medication antibiotic = antibioticFactory.createMedication();
        Medication painkiller = painkillerFactory.createMedication();

        // Observer
        Order order = new Order();
        order.addObserver(new Customer("Иван"));

        // Command
        ShoppingCart shoppingCart = new ShoppingCart();
        Command addToCartCommand = new AddToCartCommand(shoppingCart, antibiotic);
        addToCartCommand.execute();

        // Strategy
        OrderContext orderContext = new OrderContext(new ExpressDeliveryStrategy());
        orderContext.processOrder(order);

        // Decorator
        OrderDecorator giftWrapDecorator = new GiftWrapDecorator();
        giftWrapDecorator.decorate(order);

        OrderDecorator discountDecorator = new DiscountDecorator();
        discountDecorator.decorate(order);

        // Additional logic, if needed
    }
}
