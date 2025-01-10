package Final_Prepration;

import java.util.Scanner;

public class MinInsertionToFormAPalindrome {
    public static String makePalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        int left = 0;                                                   // Pointer at the start of the string
        int right = str.length() - 1;                            // Pointer at the end of the string
        int insertions = 0;

        while (left < right) {
            if (sb.charAt(left) == sb.charAt(right)) {
                                                                 // If characters match, move both pointers inward
                left++;
                right--;
            } else {
                                                                // If characters don't match, add a character
                if (sb.charAt(left) != sb.charAt(right)) {
                    sb.insert(right + 1, sb.charAt(left));
                    insertions++;
                }
                left++;
            }
        }

        System.out.println("Number of insertions: " + insertions);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter here: ");
        String str = sc.nextLine();
        String result = makePalindrome(str);
        System.out.println("Palindrome: " + result);
    }
}
