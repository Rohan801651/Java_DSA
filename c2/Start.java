package c2;

import java.util.*;

public class Start {
    public static void main(String[] args) {
        Student students[] = new Student[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("enter Name " + (i + 1));
            String name = sc.next();
            System.out.println("Enter Roll: " + (i + 1));
            int roll = sc.nextInt();

            students[i] = new Student(name, roll); // ^

        }
        
        for (int j = 0; j < 3; j++) {
            System.out.println(students[j].getStdName());
            System.out.println(students[j].getRoll());
          
        }
    }
}
