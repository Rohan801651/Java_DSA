package dsaAssignment2;

import java.util.Scanner;

public class MyArray {

    private int[] arr;
    int count = 0;
    Scanner sc = new Scanner(System.in);

    public MyArray(int length) {
        arr = new int[length];
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // insert function
    // 2) Create method for INSERT operation of ARRAY.
    public void insert(int elements) {
        // System.out.println("running3 "+ count);

        if (arr.length == count) { // not executes when length and elements are same 5,5

            // System.out.println("running1 "+ count);
            // System.out.println("running2 "+ items.length);
            int[] newItems = new int[count * 2];
            // System.out.println(newItems.toString());
            // elements from the old array to the new array
            for (int i = 0; i < count; i++) {
                newItems[i] = arr[i];
            }

            arr = newItems; // reference
        }

        // Insert the new element at the end of the array
        // and increment the count of elements
        // System.out.println("running3 "+ count);
        arr[count++] = elements; // count is basically index

        // System.out.println("running4 "+count); // value is 5

    }

    // 3) Create method for REMOVE operation of ARRAY.
    public void remove(int index) {
        System.out.println("running1 " + count); // val 5
        for (int i = index; i < count; i++) {
            System.out.println("running2 " + count);
            arr[i] = arr[i + 1];
            count--;
        }
    }

    // 4) Create method for SEARCH operation of ARRAY.

    public int search(int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                int val = (i + 1);
                return val;
            }

        }
        return 0;
    }

    // 5) Create method for finding MAX number in ARRAY.

    public void max() {
        int max = arr[0]; // should be "sabse chota number" or assign first element
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) { // comparing with every element
                max = arr[i]; // agar koi value 0 ya first element se choti ha store that value in max
            }
        }
        System.out.println("max is : " + max);
    }

    // 6) Create method for finding MIN number in ARRAY.

    public void min() {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Min is: " + min);
    }

    // 7) Create method for finding Common number of items from two ARRAYS.

    public void intersection() {
        System.out.println("Enter Size of set/ Array 1 to find intersection: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter Value in :" + (i + 1));
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Size of set/ Array 2 to find intersection: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Enter Value in :" + (i + 1));
            arr2[i] = sc.nextInt();
        }
        System.out.println("Common Values are: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[i]) {
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }

    // 8) Create method for finding Product of numbers in ARRAY.

    public void productOfArray() {
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            res = res * arr[i];
        }
        System.out.println(res);
    }

    // 9) Create method for finding AVERAGE of numbers in ARRAY.

    public void average() {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            n += arr[i];
        }
        int avg = n / arr.length;
        System.out.println("avg : " + avg);
    }

    // 10) //Create method for returning REVERSE of ARRAY.

    public void reversedArray() {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    // Create method for REPLACE number in ARRAY.

    public void replaceWith(int index, int element) {
        if (index >= 0 && index < arr.length) { // index is within the valid range, could be count
            arr[index] = element;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Index out of bounds");
        }
    }

    // Create method for finding Distinct numbers in ARRAY
    public void distinct() {
        for (int i = 0; i < count; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(arr[i]);
            }
        }
    }

    // Create method for finding EVEN numbers in ARRAY.

    public void even() {
        for (int i = 0; i < count; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public void odd() {
        for (int i = 0; i < count; i++) {
            if (arr[i] % 2 != 0) { // jo 2 se divide na ho completely let them print
                System.out.println(arr[i]);
            }
        }
    }

    public MyArray prime() {
        MyArray prime = new MyArray(count);
        for (int i = 0; i < count; i++) {
            boolean isPrime = true;
            for (int j = 2; j < arr[i] / 2; j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) { // if true
                prime.insert(arr[i]);
            }
        }
        return prime;
    }

}
