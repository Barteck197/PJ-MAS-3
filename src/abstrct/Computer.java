package abstrct;

public class Computer extends Asset{
    private String operatingSystem;

    public Computer(String name, String operatingSystem) {
        super(name);
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Nazwa: " + this.getName() + "\tOS: " + operatingSystem;
    }
}
