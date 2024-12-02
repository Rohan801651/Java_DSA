package all;

import java.util.Scanner;

public class TimeComplexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        String name = "Rohan";
        for (int i = 1; i <= n; i++) {
            dsa d = new dsa(name);
            System.out.println(d.name+" " + i);
            
        }
    }
}
