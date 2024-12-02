package all;// package DSA_JAVA;

public class ReverseString {
    // + Bit manipulation
    public static void main(String[] args) {
        /*
         * String str = "amaan";
         * for (int i = 4; i >= 0; i--) {
         * char n = str.charAt(i);
         * System.out.print(n);
         * StringBuilder stb = new StringBuilder("rohan");
         * for (int i = 4; i >= 0; i--) {
         * char n = stb.charAt(i);
         * System.out.print(n);
         * }
         * }
         */

        // BIT MANIPULATION

        // GetBit
        /*
         * int n=5; // → 0101
         * int pos = 3;
         * int bitMask = 1<<pos;
         * 
         * if((bitMask & n) == 0) {
         * System.out.println("Bit is ZERO ");
         * }else{
         * System.out.println("bit is non Zero || one");
         * }
         */

        // SetBit
        /*
         * int n = 5;
         * int pos = 1;
         * int bitMask = 1<<pos;
         * 
         * int newNumber = bitMask | n;
         * System.out.println(newNumber);
         * 
         */

        // Clear Bit

        /*
         * int n = 5;
         * int pos = 2;
         * int bitMask = 1 << pos;
         * 
         * int not = ~(bitMask);
         * int number = not & n;
         * 
         * System.out.println(number);
         * 
         */

    }
}
