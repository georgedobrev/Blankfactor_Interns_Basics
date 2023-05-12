public class P01FizzBuzz {

    public static void main(String[] args) {

        System.out.println(wordMaker(15));
    }

    public static String wordMaker(int number){

        StringBuilder word = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0)
                word.append("FizzBuzz");
            else if (i % 5 == 0)
                word.append("Buzz, ");
            else if (i % 3 == 0)
                word.append("Fizz, ");
            else
                word.append(i + ", ");
        }
        return word.toString();
    }

}




