public class Painkiller implements Medication {
    private String name;

    public Painkiller(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}