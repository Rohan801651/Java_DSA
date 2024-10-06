package ArrayListTask;

import java.util.*;

public class Start {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayListManipulation arrayListManipulation = new ArrayListManipulation();
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        System.out.println("Enter Size");
        int size = sc.nextInt();

        System.out.println("Enter Values ");
        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            arrayListManipulation.addElement(val);
        }

        // arrayListManipulation.print(arrList);
        arrayListManipulation.removeElement( 0);


        // System.out.println(arrayListManipulation.addElement(0, 12));

    }
}
