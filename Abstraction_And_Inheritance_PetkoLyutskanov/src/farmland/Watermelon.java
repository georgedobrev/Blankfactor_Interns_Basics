package farmland;

public class Watermelon extends Seed {
    private static final Soil SOIL_TYPE = Soil.SANDY;
    private double watermelonPlantedWeight;

    public Watermelon(int seedSize, double weight, String colour) {
        super(seedSize, weight, colour);
    }


    @Override
    public double harvest() {
        double harvested = watermelonPlantedWeight * 4 * SOIL_TYPE.getSoilValue();
        watermelonPlantedWeight = 0;

        return harvested;
    }

    @Override
    public void plant(double kilograms) {
        this.watermelonPlantedWeight += kilograms;
    }
}
