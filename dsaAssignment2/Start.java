package dsaAssignment2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        MyArray array;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Length");
        int length = sc.nextInt();
        array = new MyArray(length);

        System.out.println("Insert Values ");
        for (int i = 0; i < length; i++) {
            int elements = sc.nextInt();
            array.insert(elements);
        }

        System.out.println();
        System.out.println("1 to Remove element");
        System.out.println("2 to SEARCH element");
        System.out.println("3 to MAX element");
        System.out.println("4 to MIN element");
        System.out.println("5 to Common element");
        System.out.println("6 to Product element");
        System.out.println("7 to AVERAGE element");
        System.out.println("8 to REVERSE element");
        System.out.println("9 to Distinct element");
        System.out.println("10 to REPLACE element");
        System.out.println("11 to EVEN element");
        System.out.println("12 to ODD element");
        System.out.println("13 to PRIME element");
        System.out.println();

        while (true) {
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Remove ");
                    int index = sc.nextInt();
                    array.remove(index);
                    break;
                }
                case 2: {
                    System.out.println("Search");
                    System.out.println("\n Enter Element");
                    int element = sc.nextInt();
                    System.out.println("value found on position " + array.search(element));
                    break;
                }
                case 3: {
                    System.out.println("Max of array");
                    array.max();
                    break;
                }
                case 4: {
                    System.out.println("Min of array");
                    array.min();
                    break;
                }
                case 5: {
                    System.out.println("Common Element");
                    array.intersection();
                    break;
                }
                case 6: {
                    System.out.println("Product Of Array");
                    array.productOfArray();
                    break;
                }
                case 7: {
                    System.out.println("Average of array");
                    array.average();
                    break;
                }
                case 8: {
                    System.out.println("Reversed array");
                    array.reversedArray();
                    break;
                }
                case 9: {
                    System.out.println("Distinct Element ");
                    array.distinct();
                    break;
                }
                case 10: {
                    System.out.println("Replace Element ");
                    System.out.print("Enter index: ");
                    int key = sc.nextInt();
                    System.out.print("Enter Element: ");
                    int element = sc.nextInt();
                    array.replaceWith(key, element);
                    break;
                }
                case 11: {
                    System.out.println("Even numbers in Array :");
                    array.even();
                    break;
                }
                case 12: {
                    System.out.println("Odd Numbers in Array: ");
                    array.odd();
                    break;
                }
                case 13: {
                    System.out.println("Prime");
                    System.out.println(array.prime());
                    break;
                }

                default: {
                    System.out.println("Invalid number entered !!!");
                    break;
                }
            }
            
        }
    }
}
