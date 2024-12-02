package AllStacks.StacksByArrays;

import java.util.*;

public class StartStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Stack: ");
        int n = sc.nextInt();

        Stacks stack = new Stacks(n);

        System.out.println("Enter Values in stacks: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            stack.push(val);
        }

        System.out.println("No of times to pop");
        int noPop = sc.nextInt();
        for (int i = 0; i < noPop; i++) {
            stack.pop();
        }


        System.out.println("peek "+stack.peek());


        stack.display();






    }
}
