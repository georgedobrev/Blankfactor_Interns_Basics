class Car extends Vehicle implements Machine {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void move() {
        System.out.println("The " +  brand + " is moving.");
    }

    @Override
    public void stop() {
        System.out.println("The " + brand + " is stopping.");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine of car " + brand);
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping engine of car " + brand);
    }


    public void playMusic() {
        System.out.println("Playing music in car " + brand);
    }


    public void stopMusic() {
        System.out.println("Stopping music in car " + brand);
    }
}