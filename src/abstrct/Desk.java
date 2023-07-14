package abstrct;

public class Desk extends Asset{
    private int size;

    public Desk(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "size=" + size +
                '}';
    }
}
