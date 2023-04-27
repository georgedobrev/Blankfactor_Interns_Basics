import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));

    }

    public static boolean isPalindrome(int x) {

        String number = String.valueOf(x);
        String check =  new StringBuilder(number).reverse().toString();
        System.out.println(check);

        if(number.equals(check)){
            return true;
        }else {
            return false;
        }

    }
}


//2ro reshenie

/*

public class isPalindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        palindromeCheck(n);

    }
    private static void palindromeCheck(int n) {
            int r,sum=0,temp;

            temp=n;
            while(n>0){
                r=n%10;
                sum=(sum*10)+r;
                n=n/10;
            }
            if(temp==sum)
                System.out.println("True");
            else
                System.out.println("False");
        }
}
 */
