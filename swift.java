public class swift {
        public static void main(String []args) {
    
            // if a number is odd or even
    
            int number = 15;
    
            int result = number % 2; // gives us the remainder
    
            // java memory
    
            /*
    
                number -> 13
    
                result -> 1
    
            * */
            if (number == 0) {
                System.out.println("number is neither even nor odd");
            }
            else if (number == 1) {
                System.out.println("just for fun");
            }
            else if (result == 0) {
                System.out.println("its an even number");
            } else {
                System.out.println("its an odd number");
            }
    
            System.out.println("end of the program");
    
    
        }
    
        public void nothing() {
            String s = "madam";
            boolean result = palindrome(s);
    
            if (result) {
                System.out.println("palindrome");
            } else {
                System.out.println("not a palindrome");
            }
        }
    
        public static boolean palindrome(String s) {
            int x = 0;
            int y = s.length()-1;
            while (x < y) {
                if (s.charAt(x) != s.charAt(y)) {
                    return false;
                }
                x++;y--;
            }
            return true;
        }
    }
    

