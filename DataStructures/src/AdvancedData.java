import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AdvancedData {
    public static void main(String[] args) {
/*
        String[] names = {"Robi","Radko","Robi","Radko","Robi" };
        Map<String, Integer> namesCount = new HashMap<>();

        for (int i = 0; i <names.length ; i++) {
            if(namesCount.containsKey(names[i])){
                namesCount.put(names[i], namesCount.get(names[i]) + 1);
            }else {
                namesCount.put(names[i], 1);
            }
        }

        String key = Collections.max(namesCount.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.print(key +": " + namesCount.get(key));

 */

/*
        int[][] matrix1= { { 3, 2, 1 },
                { 9, 11, 5 },
                { 6, 0, 13 }};

        int[][] matrix2= { { 3, 2, 1 },
                { 9, 11, 5 },
                { 6, 0, 13 }};

        int res[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = matrix1[i][j] +matrix2[i][j] ;
            }
        }

        for (int i = 0; i < res.length; i++){
            System.out.println("");

            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");


            }}
 */
/*

        int[][] a = {{3, 2, 1},
                {9, 11, 5},
                {6, 0, 13}};

        int n = 3;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {

                int temp = a[i][j];
                a[i][j] = a[n - 1 - j][i];
                a[n - 1 - j][i] = a[n - 1 - i][n - 1 - j];
                a[n - 1 - i][n - 1 - j] = a[j][n - 1 - i];
                a[j][n - 1 - i] = temp;
            }
        }


        for (int i = 0; i < a.length; i++) {
            System.out.println("");

            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");

            }
        }

        */

        Integer[] values = {4, 5, 6, 8, 1};


        HashMap<Integer, Integer> capitalCities = new HashMap<Integer, Integer>();

        // Add keys and values (Country, City)
        capitalCities.put(0, 5);
        capitalCities.put(1, 7);
        capitalCities.put(2, 4);
        capitalCities.put(3, 2);
        capitalCities.put(4, 8);

        int check = 12;

        for (int i = 0; i < capitalCities.size(); i++) {
            int temp = check - capitalCities.get(i);
            if (capitalCities.containsValue(temp)) {
                
                System.out.println(capitalCities.get(i) + "," + temp);

                capitalCities.put(i, 0);
            }

        }

    }
}