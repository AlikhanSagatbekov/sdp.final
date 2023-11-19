public class Antibiotic implements Medication {
    private String name;

    public Antibiotic(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
