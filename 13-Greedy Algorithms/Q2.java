/*Fractional Knapsack
Given the weights and values of N items, put these items in a knapsack of
capacity W to get the maximum total value in the knapsack.

value = [60, 100, 120]
weight = [10, 20, 30]

W = 50

ans = 240*/

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int W = 50;
        int n = value.length;

        // Step 1: Create a ratio array to store {index, value-to-weight ratio}
        double[][] ratio = new double[n][2];


        for (int i = 0; i < n; i++) {
            ratio[i][0] = i; // Store index
            ratio[i][1] = (double) value[i] / weight[i]; // Store value-to-weight ratio
        }

        // Step 2: Sort the ratio array in descending order based on the ratio
        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));

        // Step 3: Fill the knapsack greedily

    }
}
