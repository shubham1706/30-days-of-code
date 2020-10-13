package knapsack;

import java.util.ArrayList;
import java.util.Collections;

class Knapsack {
    private static final int WEIGHT = 1;
    private static final int VALUE = 0;
    static ArrayList<ArrayList<Integer>> knapsackProblem(int[][] items, int capacity) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        ArrayList<Integer> pickedItems = new ArrayList<>();
        ArrayList<Integer> pickedWeight = new ArrayList<>();

        if (items.length==0 || capacity==0) {
            pickedWeight.add(0);
            output.add(pickedWeight);
            output.add(pickedItems);
            return output;
        }

        int[][] matrix = new int[items.length+1][capacity+1];

        for (int i=1; i < matrix.length; i++) {
            for (int j=1; j < matrix[0].length; j++) {
                if (j >= items[i-1][WEIGHT] &&
                        items[i-1][VALUE] + matrix[i-1][j-items[i-1][WEIGHT]] > matrix[i-1][j]) {
                    matrix[i][j] = items[i-1][VALUE] + matrix[i-1][j-items[i-1][WEIGHT]];
                } else {
                    matrix[i][j] = matrix[i-1][j];
                }
            }
        }
//        for (int[] ints : matrix) {
//            for (int j = 0; j < matrix[0].length; j++)
//                System.out.print(ints[j] + " ");
//            System.out.println();
//        }

        int i = matrix.length-1, j = matrix[0].length-1;
        pickedWeight.add(matrix[i][j]);
        output.add(pickedWeight);
        while (i>=1 && j>=1) {
            if (matrix[i][j]!=matrix[i-1][j]) {
                pickedItems.add(i-1);
//                System.out.println(i);
                j-=items[i-1][WEIGHT];
            }
            i--;
        }
        Collections.reverse(pickedItems);
        output.add(pickedItems);
        return output;
    }
}
