package Cars;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CarFileReader {

    public static ArrayList<Car> readCarsFromFile(String filename) throws IOException {

        ArrayList<Car> cars = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();

        while (line != null) {
            try {
                String[] fields = line.split(" ");
                String model = fields[0];
                int engineSpeed = Integer.parseInt(fields[1]);
                int enginePower = Integer.parseInt(fields[2]);
                int cargoWeight = Integer.parseInt(fields[3]);
                String cargoType = fields[4];
                double tire1Pressure = Double.parseDouble(fields[5]);
                int tire1Age = Integer.parseInt(fields[6]);
                double tire2Pressure = Double.parseDouble(fields[7]);
                int tire2Age = Integer.parseInt(fields[8]);
                double tire3Pressure = Double.parseDouble(fields[9]);
                int tire3Age = Integer.parseInt(fields[10]);
                double tire4Pressure = Double.parseDouble(fields[11]);
                int tire4Age = Integer.parseInt(fields[12]);

                Engine engine = new Engine(enginePower, engineSpeed);
                Cargo cargo = new Cargo(cargoWeight, cargoType);
                Tires[] tires = {new Tires(tire1Pressure, tire1Age),
                        new Tires(tire2Pressure, tire2Age),
                        new Tires(tire3Pressure, tire3Age),
                        new Tires(tire4Pressure, tire4Age)};

                Car car = new Car(model, engine, cargo, tires);
                cars.add(car);
            } catch (NumberFormatException e) {
                System.err.println("Skipping line: " + line);
            }

            line = reader.readLine();
        }
        return cars;
    }
}