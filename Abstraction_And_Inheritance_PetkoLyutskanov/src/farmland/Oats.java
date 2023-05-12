package farmland;

public class Oats extends Seed {
    private static final Soil SOIL_TYPE = Soil.CLAY;
    private double oatsPlantedWeight;

    public Oats(int seedSize, double weight, String colour) {
        super(seedSize, weight, colour);
    }

    @Override
    public double harvest() {
        double harvested = oatsPlantedWeight * 4 * SOIL_TYPE.getSoilValue();
        oatsPlantedWeight = 0;

        return harvested;
    }

    @Override
    public void plant(double kilograms) {
        this.oatsPlantedWeight += kilograms;
    }
}
