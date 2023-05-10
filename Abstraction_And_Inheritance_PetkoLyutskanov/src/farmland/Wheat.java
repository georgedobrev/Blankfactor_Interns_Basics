package farmland;

public class Wheat extends Seed {
    private static final Soil SOIL_TYPE = Soil.BLACK;
    private double wheatPlantedWeight;

    public Wheat(int seedSize, double weight, String colour) {
        super(seedSize, weight, colour);
    }

    @Override
    public double harvest() {
        double harvested = wheatPlantedWeight * 3 * SOIL_TYPE.getSoilValue();
        wheatPlantedWeight = 0;

        return harvested;
    }

    @Override
    public void plant(double kilograms) {
        this.wheatPlantedWeight += kilograms;
    }
}
