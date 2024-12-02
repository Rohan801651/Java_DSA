package all;// package DSA_JAVA;

public class dsa {
    String name; public dsa(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
/*         String name = "rohan";
        for (int i = name.length() - 1; i >= 0; i--) {
            String temp = name.charAt(i) + "";
            System.out.print(temp);
        } */


        int rows = 3   ,cols = 5;
/*         for (int i = 1; i <= rows; i++) { // i = no of lines, rows
            for (int j = 0; j <= 4-i; j++) {  
                System.out.print("*");
            }
            System.out.println();
        } */





        int a = 6;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows*2-i; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= i*2-1; j++) { // #######
                System.out.print("&");
            }
            System.out.println();

        }
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= a-1; j++) {
                System.out.print("&");
            }
            a--;
            System.out.println();
        }

        








         










    }
}
