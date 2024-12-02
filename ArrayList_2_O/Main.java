package ArrayList_2_O;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayListM2 list = new ArrayListM2();

        list.addElement(0,2);
        list.addElement(1,3);
        list.addElement(2,6);
        list.addElement(3,1);
        list.addElement(4,11);

        list.print();
//      list.searchElement(4);

//        System.out.println(list.removeElement(1));

//        System.out.println(Arrays.toString(list.evenNumbersInList()));
//        list.reversedList();
        list.prime();
    }


}
