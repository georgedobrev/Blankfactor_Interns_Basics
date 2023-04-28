import java.util.HashMap;

public class PairsOfNumbers {
    public static void main(String[] args) {

        Integer[] values = {4, 5, 6, 8, 1};
        int check = 12;
        HashMap<Integer, Integer> values2 = new HashMap<Integer, Integer>();

        pairsOfNumbers(values,values2,check);

    }

    private static void pairsOfNumbers(Integer[] values, HashMap<Integer,Integer> values2, int check) {


        for (int i = 0; i < values.length; i++)
            values2.put(i, values[i]);

        for (int i = 0; i < values2.size(); i++) {
            int temp = check - values2.get(i);
            if (values2.containsValue(temp)) {

                System.out.println(values2.get(i) + "," + temp);

                values2.put(i, 0);
            }

        }

    }
}
