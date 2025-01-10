package Final_Prepration;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MinDistance_TwoWords {
    public static int minDis(String sentence, String word1, String word2) {

        int minDistance = Integer.MAX_VALUE;

        int i1 = -1;
        int i2 = -1;

        String[] updSentence = sentence.split("\\s+");

        for (int i = 0; i < updSentence.length; i++) {
            if (updSentence[i].equals(word1)) {
                i1 = i;
                if (i2 != -1) {
                    minDistance = Math.min(minDistance, Math.abs(i1 - i2));
                }
            }
            else if (updSentence[i].equals(word2)) {
                i2 = i;
                if (i1 != -1) {
                    minDistance = Math.min(minDistance, Math.abs(i1 - i2));
                }
            }
        }

        if (minDistance == Integer.MAX_VALUE) {
            return -1;
        }
        return minDistance;
    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sentence, word1, word2;

        System.out.println("Enter a Sentence: ");
         sentence = sc.nextLine();
        System.out.println("Enter First word: ");
         word1 = sc.next();
        System.out.println("Enter second word: ");
         word2 = sc.next();

        int min_Distance = minDis(sentence, word1, word2);

        if (min_Distance == -1) {
            System.out.println("Nothing to show");
        } else {
            System.out.println("Mininum distance is : " +min_Distance);
        }




    }
}
