package AllStacks;

import java.util.Stack;

public class Balancing {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "(()))";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            } else if (str.charAt(i) == ')') {
                if (stack.pop() != '(') {
                    System.out.println("Eqn is un balanced ");
                    return;
                }
                if (stack.isEmpty()) {
                    System.out.println("Unbalanced Brackets");
                    return;
                }

            }

        }



    }
}
