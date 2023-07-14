package abstrct;

public class Car extends Asset{
    private float engineCapacity;

    public Car(String name, float engineCapacity) {
        super(name);
        this.engineCapacity = engineCapacity;
    }


    @Override
    public String toString() {
        return "Name: " + this.getName() + "\tPoj. silnika: " + this.engineCapacity;
    }
}
