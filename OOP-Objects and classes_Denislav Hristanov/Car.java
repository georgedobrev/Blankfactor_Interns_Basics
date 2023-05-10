import java.util.Scanner;
 class Car {
     private String model;
     private Engine engine;
     private Cargo cargo;
     private Tire[] tires;

     public Car(String model, int EngineSpeed, int enginePower, String cargoType, int cargoWeight, double tire1Pressure, int tire1Age, double tire2Pressure, int tire2Age, double tire3Pessure, int tire3Age, double tire4Pressure, int tire4Age) {
         this.model = model;
         this.engine = new Engine(engineSpeed, enginePower);
         this.cargo = new Cargo(cargoType, cargoWeight);
         this.tires = new Tire[4];
         this.tires[0] = new Tire(tire1Pressure, tire1Age);
         this.tires[1] = new Tire(tire2Pressure, tire2Age);
         this.tires[2] = new Tire(tire3Pessure, tire3Age);
     }

     public String getModel() {
         return model;
     }

     public Engine getEngine() {
         return engine;
     }

     public cargo getCargo() {
         return cargo;
     }

     public Tire[] getTires() {
         return tires;
     }

     public boolean hasTireWithLessPressure(double pressure) {
         for (Tire tire : tires) {
             if (tire.getPressure() < pressure) {
                 return true;
             }
         }
         return false;
     }

     public String toString() {
         return model;
     }
 }

 class Engine {
     private int speed;
     private int power;

     public Engine(int speed,int power) {
         this.speed = speed;
         this.power = power;
     }

     @Override
     public int getSpeed() {
         return speed;
     }

     public int getPower() {
         return power;
     }
 }

 class Cargo {
     private String type;
     private int weight;

     public Cargo(String type,int weight) {
         this.type = type;
         this.weight = weight;
     }

     public  String getType() {
         return type;
     }

     public int getWeight() {
         return weight;
     }
 }

 class Tire {
     private  double pressure;
     private int age;

     public Tire(double pressure,int age) {
         this.pressure = pressure;
         this.age = age;
     }

     public double getPressure() {
         return pressure;
     }
     public int getAge() {
         return age;
     }
 }

 public class CarTrackingProgram {
     public static void main(String[]args) {
         Scanner scanner = new Scanner(System.in);
         int n = Integer.parseInt(scanner.nextLine());
         Car[] cars = new Car[n];
         for(int i = 0; i < n;i++) {
             String[] carData = scanner.nextLine().split("\\s+");
             String model = carData[0];
             int engineSpeed = Integer.parseInt(carData[1]);
             int eginePower = Integer.parseInt(carData[2]);
             String cargoType = carData[3];
             int cargoWeight = Integer.parseInt(carData[4]);
             double tire1Pressure = Double.parseDouble(carData[5]);
             int tire1Age = Integer.parseInt(carData[6]);
             double tire2Pressure

         }
     }
 }
