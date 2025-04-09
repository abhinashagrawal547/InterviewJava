package MyPractice;

public class LeetCode {
    public static void main(String[] args){
        System.out.println(mergeAlternately("cdf", "a"));
    }

    public static String mergeAlternately(String word1, String word2){
        char[] mergeSet = new char[word1.length() + word2.length()];
        int length = mergeSet.length;
        int counter = 0;
        int smallerWord=word1.length();

        if (word1.length() > word2.length())
            smallerWord = word2.length();
         else if (word2.length() > word1.length())
            smallerWord = word1.length();

        for (int i = 0; i < (smallerWord*2) ; i++) {
            if (i % 2 == 0)
                mergeSet[i] = word1.charAt(i/2);
            else
                mergeSet[i] = word2.charAt(i/2);
        }

        if (word1.length() > word2.length()) {
            for (int i = word1.length(); i < length; i++) {
                mergeSet[i] = word1.charAt(i-smallerWord);
            }
        } else if (word2.length() > word1.length()) {
            for (int i = word2.length(); i < length; i++) {
                mergeSet[i] = word1.charAt(i-smallerWord);
            }
        }
        String finalString = new String(mergeSet);
        return finalString;
    }

    /*for(int i=0; i<input.length;i++){
        isPossible(input, input[i]);
    }*/

    /*private static boolean isPossible(int[] input, int position) {
        if(input[i] == 0)
            isPossible = false;

        int position_i = input[i];

        for(int )
    }*/
}