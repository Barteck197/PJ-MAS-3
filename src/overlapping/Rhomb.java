package overlapping;

public class Rhomb extends Figure {
    private int diagonal1;
    private int diagonal2;

    public Rhomb(String name, int diagonal1, int diagonal2) {
        super(name);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double getPerimeter(){
        return 2 * Math.sqrt((diagonal1 * diagonal1) + (diagonal2 * diagonal2));
    }

    @Override
    public float getArea() {
        float out = (diagonal1 * diagonal2) / 2;
        return out * 1.0f;
    }
}
