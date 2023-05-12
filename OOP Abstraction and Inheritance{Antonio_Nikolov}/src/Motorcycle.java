class Motorcycle extends Vehicle implements Machine {
    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println("Starting motorcycle " + brand);
    }

    @Override
    public void stop() {
        System.out.println("Stopping motorcycle " + brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine of motorcycle " + brand);
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping engine of motorcycle " + brand);
    }
}