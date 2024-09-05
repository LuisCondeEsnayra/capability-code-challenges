package com.challenge.easy.arrays;

import java.util.*;

/**
    # Number of Good Pairs

    Given an array of integers nums, return the number of good pairs.

    A pair (i, j) is called good if nums[i] == nums[j] and i < j.

    Example 1:
        Input: nums = [1,2,3,1,1,3]
        Output: 4
        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

    Example 2:
        Input: nums = [1,1,1,1]
        Output: 6
        Explanation: Each pair in the array are good.

    Example 3:
        Input: nums = [1,2,3]
        Output: 0

    Constraints:

        * 1 <= nums.length <= 100
        * 1 <= nums[i] <= 100

 */
public class NumberOfGoodPairs {
    public static int countPairs(Collection<Integer> values){
        int count = 0;
        for(Integer val : values){
            count += (val * (val - 1) ) / 2 ;
        }
        return count;
    }


    public static Collection<Integer> createPairsMap(int[] numbers){
        Map<Integer, Integer> mapNum = new HashMap();
        for(int num : numbers){
            if( mapNum.containsKey(num)){
                mapNum.put(num, mapNum.get(num)+1);
            }
            else{
                mapNum.put(num, 1);
            }
        }
        return mapNum.values();
    }


    public static int numIdenticalPairs(int[] nums) {

        Collection<Integer> pairMapValues = createPairsMap(nums);
        return countPairs(pairMapValues);
    }

    public static void main(String[] args) {

    }
}
