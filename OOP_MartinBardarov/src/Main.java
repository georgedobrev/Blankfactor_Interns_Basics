import Cars.Car;
import Cars.CarFileReader;
import Cars.CarFunc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;


// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

//        Date date1 = new Date(2022, 9, 6);
//        Date date2 = new Date(2022, 8, 6);
//
//        DateModifier dateModifier = new DateModifier();
//
//        long dateDiff = dateModifier.dateDiff(date1, date2);
//        System.out.println(dateDiff);

//


        List<Car> cars = CarFileReader.readCarsFromFile("/Users/Martin.Bardarov/Desktop/Java " +
                "Projects/OOPTasks/src/Cars/CarsDataBase");
        System.out.println("You have"+" "+cars.size()+" "+"cars");
        CarFunc.printFragileCarsWithLowPressureTires(cars);
        CarFunc.printFlamableCarsWithHighPowerEngine(cars);


    }
}