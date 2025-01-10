package Final_Prepration;

public class WordsDistance {


    public static int minDis(String sentence, String word1, String word2) {
        int minDistance = Integer.MAX_VALUE;
        int i1 = -1;
        int i2 = -1;
        String[] sent = sentence.split("\\s+");

        for (int i = 0; i < sent.length; i++) {
            if (sent[i].equals(word1)) {
                i1 = i;
                if (i2 != -1) {
                    minDistance = Math.min(minDistance, Math.abs(i1 - i2));
                }
            } else if (sent[i].equals(word2)) {
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



    public static String palindrome(String str) {

        int insertions = 0;
        StringBuilder sb = new StringBuilder(str);
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (sb.charAt(left) == sb.charAt(right)) {
                left++;
                right--;
            } else {

                if (sb.charAt(left) != sb.charAt(right)) {
                    sb.insert(right + 1, sb.charAt(left));
                    insertions++;
                }
                left++;
            }

        }

        System.out.println("Minimum Insertions are: "+ insertions);
        return sb.toString();
    }




}
