package overlapping;

public class Square extends Figure{
    private float sideLength;

    public Square(String name, float sideLength) {
        super(name);
        this.sideLength = sideLength;
    }

    public float getSideLength() {
        return sideLength;
    }

    @Override
    public float getArea() {
        return sideLength*sideLength;
    }
}
