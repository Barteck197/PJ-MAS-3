package disjoint;

public class BikeWheel extends BikePart{
    private float perimeter;

    public BikeWheel(String name, int productionYear, float perimeter) {
        super(name, productionYear);
        this.perimeter = perimeter;
    }
}
