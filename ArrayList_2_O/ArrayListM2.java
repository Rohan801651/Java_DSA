package ArrayList_2_O;

import java.util.ArrayList;

public class ArrayListM2 {
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public void addElement(int index, int element) {
        if (index < 0 /* || index >= arrayList.size() */) {
            System.out.println("Error IndexOutOfBounds ");
        } else {
            arrayList.add(index, element);

        }
        // print();
    }

    public void searchElement(int val) {
        boolean isPresent = false;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == val) {
                isPresent = true;
            } else {

            }
        }
        if (isPresent) {
            System.out.println(val + " Found on index " + arrayList.indexOf(val));
        }
    }

    public ArrayList<Integer> removeElement(int index) {
        ArrayList<Integer> newList = null;
        if (index < 0 || index > arrayList.size()) {
            System.out.println("IndexOutOfBounds Error ");
        } else {
            arrayList.remove(index);
            newList = new ArrayList<Integer>(arrayList);
        }
        return newList;
    }

    public int[] evenNumbersInList() {
        int count = 0;
        int[] even = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                even[i] = arrayList.get(i);
                count++;

            } else {

            }
        }
        System.out.println("Total Even numbers in List are: " + count);
        return even;
    }

    public void reversedList() {
        for (int i = arrayList.size() - 1; i >= 0; i--) { // *****
            System.out.print(arrayList.get(i) + " ");
        }
    }

    public void prime() {
        for (int i = 0; i < arrayList.size(); i++) {
            int num = arrayList.get(i);
            /*if (num <= 1) continue; // Skip non-prime numbers*/
            boolean isPrime = true;

            for (int j = 2; j <= num / 2; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }





    public void print() {
        System.out.println(arrayList);
    }

}
