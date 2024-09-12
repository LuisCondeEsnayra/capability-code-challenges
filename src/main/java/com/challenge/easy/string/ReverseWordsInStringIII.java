package com.challenge.easy.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
    # Reverse Words in a String III

     Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

     Example 1:
         Input: s = "Let's take LeetCode contest"
         Output: "s'teL ekat edoCteeL tsetnoc"

     Example 2:
         Input: s = "Mr Ding"
         Output: "rM gniD"

     Constraints:

         * 1 <= s.length <= 5 * 104
         * s contains printable ASCII characters.
         * s does not contain any leading or trailing spaces.
         * There is at least one word in s.
         * All the words in s are separated by a single space.

 */
public class ReverseWordsInStringIII {

    public static String reverse(String word){
        char[] reversed= new char[word.length()];
        for(int i=0; i < word.length();i++ ){
            reversed[word.length()-1-i]= word.charAt(i);
        }

        return new String(reversed);
    }

    public static String reverseWords(String s) {
        List<String> result = new ArrayList<>();
        for(String sub : s.split(" ")){
            result.add(reverse(sub));
        }

        return  String.join(" ",result);
    }

    public static void main(String[] args) {

    }
}
