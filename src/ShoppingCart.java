import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Medication> medications = new ArrayList<>();

    public void addMedication(Medication medication) {
        medications.add(medication);
        System.out.println(medication.getName() + " добавлен в корзину.");
    }

    public void checkout() {
        // Логика оформления заказа
    }
}
