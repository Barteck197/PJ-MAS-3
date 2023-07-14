package disjoint;

public class BikeChain extends BikePart{
    private float chainLength;

    public BikeChain(String name, int productionYear, float chainLength) {
        super(name, productionYear);
        this.chainLength = chainLength;
    }
}
