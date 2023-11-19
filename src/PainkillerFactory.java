public class PainkillerFactory implements MedicationFactory {
    public Medication createMedication() {
        return new Painkiller("Paracetamol");
    }
}
