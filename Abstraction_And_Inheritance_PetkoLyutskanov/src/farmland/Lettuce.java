package farmland;

public class Lettuce extends Seed {
    private static final Soil SOIL_TYPE = Soil.PEATY;
    private double lettucePlantedWeight;

    public Lettuce(int seedSize, double weight, String colour) {
        super(seedSize, weight, colour);
    }

    @Override
    public double harvest() {
        double harvested = lettucePlantedWeight * 5 * SOIL_TYPE.getSoilValue();
        lettucePlantedWeight = 0;

        return harvested;
    }

    @Override
    public void plant(double kilograms) {
        this.lettucePlantedWeight += kilograms;
    }
}
