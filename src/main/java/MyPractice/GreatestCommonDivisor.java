package MyPractice;

import java.util.ArrayList;
import java.util.List;

public class GreatestCommonDivisor {
    public static void main(String[] abcd){
        String str1 = "ABC";
        String str2 = "DEFABC";
        char[] arr1;
        char[] arr2;

        if(str1.length() < str2.length()) {
            arr1 = str1.toCharArray();
            arr2 = str2.toCharArray();
        }else {
            arr1 = str2.toCharArray();
            arr2 = str1.toCharArray();
        }

        List<Character> arr3 = new ArrayList<>();

        for(int i=0; i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    arr3.add(arr1[i]);
                    break;
                }else if(!(arr3.isEmpty())){

                }
            }
        }
    }
}
