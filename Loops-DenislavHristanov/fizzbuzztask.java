
public class fizzbuzztask {

    public static void main(String[] args) {
        int n = 15;

        for (int i = 1; i <= n; i++){
            if (i % 5 == 0 && i % 3 == 0)
                System.out.print("Fizzbuzz");
            else if (i % 5 == 0)
                System.out.print("Buzz");
            else if (i % 3 == 0)
                System.out.print("Fizz");
            else
                System.out.print(i + " ");
            System.out.println(i);

        }

    }
}
