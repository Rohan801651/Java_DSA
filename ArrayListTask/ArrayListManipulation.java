package ArrayListTask;

import java.util.ArrayList;;

public class ArrayListManipulation {
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    
    public ArrayList<Integer> addElement(int index, int element) {  //m2
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(index, element);

        return arrayList;
    }

    public void addElement(int element) {
        arrayList.add(element);
        print();
    }

    public void print(ArrayList<Integer> integerList) {    //m2
        for (int i = 0 ; i < integerList.size(); i++) {
            System.out.print(integerList.get(i)+", ");
        }
    }

    public void print() {
        System.out.println(arrayList);
    }

    public void searchElement(int val) {
        boolean isPresent = false;
        for (int i=0;i<arrayList.size();i++) {
            if (arrayList.get(i) == val) {
                isPresent = true;
            } else {

            }
        }
        if (isPresent) { // == true
            System.out.println(val+" Found on Index "+ arrayList.indexOf(val));
        } else {
            System.out.println(val+" not found");
        }
        print();
    }

    public void removeElement(int index) {
        arrayList.remove(index);
        print();
    }





}
