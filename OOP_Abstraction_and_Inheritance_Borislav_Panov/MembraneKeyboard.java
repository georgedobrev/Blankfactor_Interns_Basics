public class MembraneKeyboard extends Keyboard implements Brand, Backlight, Connectivity {
    private String switchType;
    private int sizePercentage;
    private String backlightType;
    private String brand;
    private String connectionType;
    private boolean isRechargeable;

    public MembraneKeyboard(String switchType, int sizePercentage) {
        this.switchType = switchType;
        this.sizePercentage = sizePercentage;
    }

    @Override
    public void setBacklight(String backlightType) {
        this.backlightType = backlightType;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    @Override
    public void setIsRechargeable(boolean isRechargeable) {
        this.isRechargeable = isRechargeable;
    }

    @Override
    public void getType() {
        System.out.println("Type: Membrane");
    }


    @Override
    public void showKeyboard() {
        getType();
        System.out.println("Brand: " + brand);
        System.out.println("Switch type: " + switchType);
        System.out.println("Size percentage: " + sizePercentage + "%");
        System.out.println("Backlight type: " + backlightType);
        System.out.println("Connection type: " + connectionType);
        System.out.println("Is rechargeable: " + isRechargeable);
    }
}
