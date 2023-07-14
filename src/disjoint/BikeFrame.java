package disjoint;

public class BikeFrame extends BikePart{
    private FrameSize frameSize;

    public BikeFrame(String name, int productionYear, FrameSize frameSize) {
        super(name, productionYear);
        this.frameSize = frameSize;
    }
}
