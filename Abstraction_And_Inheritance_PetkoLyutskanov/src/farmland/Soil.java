package farmland;

public enum Soil {
    CHALKY(4.3),
    CLAY(5.7),
    LOAMY(6.5),
    PEATY(7.1),
    SANDY(2.0),
    SILTY(3.2),
    BLACK(10.0);
    private double value;

    Soil(double v) {
        this.value = v;
    }

    public double getSoilValue() {
        return this.value;
    }
}
