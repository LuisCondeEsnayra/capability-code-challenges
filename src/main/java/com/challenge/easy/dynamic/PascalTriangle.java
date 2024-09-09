package com.challenge.easy.dynamic;

import java.util.ArrayList;
import java.util.List;

/**
    # Pascal's Triangle

     Given an integer numRows, return the first numRows of Pascal's triangle.

     In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

                1
               1 1
              1 2 1
             1 3 3 1
            1 4 6 4 1

     https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif

     Example 1:
         Input: numRows = 5
         Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

     Example 2:
         Input: numRows = 1
         Output: [[1]]

     Constraints:

        * 1 <= numRows <= 30

 */
public class PascalTriangle {

    public static List<Integer> currentRow (List<Integer> curr){
        int previous= 0;
        List<Integer> pivot= new ArrayList<>();
        for (int i = 0; i < curr.size(); i++) {

            pivot.add(previous + curr.get(i));
            if(i== curr.size()-1){
                pivot.add(1);
            }
            previous= curr.get(i);
        }


        return pivot;
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        if (numRows <= 0 ){
            return pascal;
        }

        current.add(1);
        pascal.add(current);

        for (int i = 1; i < numRows; i++) {
            current=currentRow(current);
            pascal.add(current);
        }


        return pascal;
    }

    public static void main(String[] args) {

    }
}
