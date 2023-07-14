package abstrct;

public abstract class Asset {
    private String name;

    public Asset(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public abstract String toString();
}
