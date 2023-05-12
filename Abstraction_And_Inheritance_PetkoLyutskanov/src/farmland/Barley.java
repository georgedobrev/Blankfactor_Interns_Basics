package farmland;

public class Barley extends Seed {
    private static final Soil SOIL_TYPE = Soil.LOAMY;
    private double barleyPlantedWeight;

    public Barley(int seedSize, double weight, String colour) {
        super(seedSize, weight, colour);
    }

    public double getBarleyPlantedWeight() {
        return barleyPlantedWeight;
    }

    public void setBarleyPlantedWeight(double barleyPlantedWeight) {
        this.barleyPlantedWeight = barleyPlantedWeight;
    }

    @Override
    public double harvest() {
        double harvested = barleyPlantedWeight * 4 * SOIL_TYPE.getSoilValue();
        barleyPlantedWeight = 0;

        return harvested;
    }

    @Override
    public void plant(double kilograms) {
        this.barleyPlantedWeight += kilograms;
    }
}
