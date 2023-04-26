
        public class CheckIfItsAPalindrome {
            public static boolean isPalindrome(int x) {
                String integerToString = Integer.toString(x);

                StringBuilder sb = new StringBuilder(integerToString);

                return integerToString.equals(sb.reverse().toString());
            }

            public static void main(String[] args) {
                int x = 121;

                if (isPalindrome(x)) {
                    System.out.println(x + " true.");
                } else {
                    System.out.println(x + " false");
                }
            }
        }


