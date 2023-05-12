package farmland;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(1500, 0);

        Barley barley = new Barley(2, 0.15, "yellow");
        barley.plant(10);

        double harvested = barley.harvest();

        if (warehouse.getCurrentCapacity() + harvested <= warehouse.getCapacity()) {
            warehouse.setCurrentCapacity(warehouse.getCurrentCapacity() + harvested);
        } else {
            double capacityRemaining = warehouse.getCapacity() - warehouse.getCurrentCapacity();
            harvested -= capacityRemaining;

            warehouse.setCurrentCapacity(capacityRemaining);

            System.out.println("Not enough space to store " + harvested + " kg of " + barley.getClass().getSimpleName());
        }

        System.out.println("Your current warehouse capacity is : " + warehouse.getCurrentCapacity());
    }
}
