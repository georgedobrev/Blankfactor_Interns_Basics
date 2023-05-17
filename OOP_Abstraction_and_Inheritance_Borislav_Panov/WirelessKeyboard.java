public class WirelessKeyboard extends Keyboard implements Brand, Backlight, Connectivity {
    private String MechanicalOrMembrane;
    private String switchType;
    private int sizePercentage;
    private String backlightType;
    private String brand;
    private String connectionType;
    private boolean isRechargeable;

    public WirelessKeyboard(String switchType, int sizePercentage) {
        this.switchType = switchType;
        this.sizePercentage = sizePercentage;
    }

    public void mechanicalOrMembrane(String MechanicalOrMembrane) {
        this.MechanicalOrMembrane = MechanicalOrMembrane;
    }

    @Override
    public void setBacklight(String backlightType) {
        this.backlightType = backlightType;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }


    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    @Override
    public void setIsRechargeable(boolean isRechargeable) {
        this.isRechargeable = isRechargeable;
    }


    @Override
    public void getType() {
        if (MechanicalOrMembrane.equals("Mechanical")) {
            System.out.println("Type: Mechanical");
        } else if (MechanicalOrMembrane.equals("Membrane")) {
            System.out.println("Type: Membrane");
        } else {
            System.out.println("Type: Wireless");
        }
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
