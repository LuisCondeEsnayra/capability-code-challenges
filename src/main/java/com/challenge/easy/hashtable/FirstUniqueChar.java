package com.challenge.easy.hashtable;

import java.util.*;

/**
    # First Unique Character in a String
     Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

     Example 1:
         Input: s = "leetcode"
         Output: 0

     Example 2:
         Input: s = "loveleetcode"
         Output: 2

     Example 3:
         Input: s = "aabb"
         Output: -1


     Constraints:

         * 1 <= s.length <= 105
         * s consists of only lowercase English letters.
 */
public class FirstUniqueChar {

    public static int firstUniqChar(String s) {
        char[] words= s.toCharArray();
        Map<Character, List<Integer>> wordMap = new HashMap<Character, List<Integer>>();

        for (int i = 0; i < words.length; i++) {
            char word= words[i];

           if(wordMap.get(word)!= null){
               List<Integer> wordList= wordMap.get(word);
               wordList.add(i);
               wordMap.put(word, wordList);

           }else{
               List<Integer> newIndexes= new ArrayList<>();
               newIndexes.add(i);
               wordMap.put(word,newIndexes);
           }

        }

        for(char letter : words){
            List<Integer> indexes = wordMap.get(letter);
            if(indexes.size() == 1){
                return indexes.get(0);
            }
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}
