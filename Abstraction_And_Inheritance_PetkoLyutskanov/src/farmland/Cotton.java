package farmland;

public class Cotton extends Seed {
    private static final Soil SOIL_TYPE = Soil.BLACK;
    private double cottonPlantedWeight;

    public Cotton(int seedSize, double weight, String colour) {
        super(seedSize, weight, colour);
    }

    @Override
    public double harvest() {
        double harvested = cottonPlantedWeight * 3 * SOIL_TYPE.getSoilValue();
        cottonPlantedWeight = 0;

        return harvested;
    }

    @Override
    public void plant(double kilograms) {
        this.cottonPlantedWeight += kilograms;
    }
}
