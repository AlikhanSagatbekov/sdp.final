public class AddToCartCommand implements Command {
    private ShoppingCart cart;
    private Medication medication;

    public AddToCartCommand(ShoppingCart cart, Medication medication) {
        this.cart = cart;
        this.medication = medication;
    }

    @Override
    public void execute() {
        cart.addMedication(medication);
    }
}
