package overlapping;

public class Rectangle extends Figure {
    private float longSide;
    private float shortSide;

    public Rectangle(String name, float longerSide, float shorterSide) {
        super(name);
        this.longSide = longerSide;
        this.shortSide = shorterSide;
    }

    public float getPerimeter() {
        return (longSide * 2) + (shortSide * 2);
    }

    @Override
    public float getArea() {
        return longSide * shortSide;
    }
}
