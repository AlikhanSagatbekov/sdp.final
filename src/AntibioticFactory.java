public class AntibioticFactory implements MedicationFactory {
    @Override
    public Medication createMedication() {
        return new Antibiotic("Amoxicillin");
    }
}