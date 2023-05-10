package farmland;

public class Sunflower extends Seed {
    private static final Soil SOIL_TYPE = Soil.LOAMY;
    private double sunflowerPlantedWeight;

    public Sunflower(int seedSize, double weight, String colour) {
        super(seedSize, weight, colour);
    }

    @Override
    public double harvest() {
        double harvested = sunflowerPlantedWeight * 3 * SOIL_TYPE.getSoilValue();
        sunflowerPlantedWeight = 0;

        return harvested;
    }

    @Override
    public void plant(double kilograms) {
        this.sunflowerPlantedWeight += kilograms;
    }
}
