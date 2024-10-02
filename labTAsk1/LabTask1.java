package labTAsk1;

public class LabTask1 {

    public void fun(int n) { // O(1) Constant Time
        System.out.println(n);
    }

    public void b(int n) { // O(n) Linear Time
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    public void add(int a) { // O(n^2)
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.println(i + j);
            }
        }
    }

    // Space Complexity

   
    public void a(int n) {    // O(1)  Constant Space  single variables are creating
        int result = n * n;
        System.out.println(result);
    }

    
    public void c(int size) {  // O(n)  because variable n is depend upon user's input
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        System.out.println(arr);
    }

    /**
     *  Difference b/w Time and Space Complexity
     *  Time Complexity => how much run time is taken by the program
     *  Space Complexity => how much space in Memory (RAM) in consuming by the program and also depends upon size of input
     */

}
