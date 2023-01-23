package ibm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // list of String
        // have to find which of the string is pallindrome
        List<String> strings = Arrays.asList("aba","abc","aab","001001","00011");
        List<String> palindromeStrings = getAllPapllindrome(strings);
        palindromeStrings.forEach(s -> System.out.println(s));
    }

    private static List<String> getAllPapllindrome(List<String> strings) {
        List<String> pallindrome = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            if (isPallindrome(strings.get(i))){
                pallindrome.add(strings.get(i));
            }
        }
        return pallindrome;
    }

    private static boolean isPallindrome(String s) {
        int i=0, j=s.length()-1;
        while (i<=j){
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else return false;
        }
        return true;
    }
}