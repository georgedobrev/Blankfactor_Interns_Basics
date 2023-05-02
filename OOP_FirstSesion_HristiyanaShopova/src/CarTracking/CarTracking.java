package CarTracking;

import java.util.Scanner;

public class CarTracking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of cars: \n");
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n; i++) {

            String[] information = scanner.nextLine().split(" ");
                String model = information[0];
                int engineSpeed = Integer.parseInt(information[1]);
                int enginePower = Integer.parseInt(information[2]);
                int cargo = Integer.parseInt(information[3]);
                String cargoType = information[4];
                 double tire1Preassure = Double.parseDouble(information[5]);
                int tire1Age = Integer.parseInt(information[6]);
                 double tire2Preassure = Double.parseDouble(information[7]);
                int tire2Age = Integer.parseInt(information[8]);
                 double tire3Preassure = Double.parseDouble(information[9]);
                int tire3Age = Integer.parseInt(information[10]);
                 double tire4Preassure = Double.parseDouble(information[11]);
                int tire4Age = Integer.parseInt(information[12]);


            if(cargoType.equals("fragile") && tire1Preassure < 1.0 && tire2Preassure < 1 && tire3Preassure < 1 && tire4Preassure < 1)
            {



            } else if(cargoType.equals("framable") && enginePower > 250)
            {


            }

        }

    }
}
