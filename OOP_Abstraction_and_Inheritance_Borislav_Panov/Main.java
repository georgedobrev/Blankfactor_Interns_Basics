public class Main {
    public static void main(String[] args) {

        MechanicalKeyboard mechanicalKeyboard = new MechanicalKeyboard("Blue", 60);
        mechanicalKeyboard.setBacklight("RGB");
        mechanicalKeyboard.setBrand("Anne Pro");
        mechanicalKeyboard.setConnectionType("Bluetooth");
        mechanicalKeyboard.setIsRechargeable(true);
        mechanicalKeyboard.showKeyboard();

        System.out.println("__________________________________________________");

        MembraneKeyboard membraneKeyboard = new MembraneKeyboard("Rubber", 100);
        membraneKeyboard.setBacklight("Red");
        membraneKeyboard.setBrand("Bloody");
        membraneKeyboard.setConnectionType("Wired");
        membraneKeyboard.setIsRechargeable(false);
        membraneKeyboard.showKeyboard();


        System.out.println("__________________________________________________");

        WirelessKeyboard wirelessKeyboard = new WirelessKeyboard("Brown", 80);
        wirelessKeyboard.mechanicalOrMembrane("Mechanical");
        wirelessKeyboard.setBacklight("RGB");
        wirelessKeyboard.setBrand("Keychron");
        wirelessKeyboard.setConnectionType("Bluetooth");
        wirelessKeyboard.setIsRechargeable(true);
        wirelessKeyboard.showKeyboard();



    }
}
