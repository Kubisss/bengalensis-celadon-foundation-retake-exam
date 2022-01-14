package multiplyItemsInMatrix;

import java.util.Arrays;

public class MultiplyItemsInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 6, 2},
                {7, 5, 6, 1},
                {3, 3, 1, 5},
                {9, 0, 5, 3}};

        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(multiplyItemsInMatrix(matrix)));
    }

    public static int[][] multiplyItemsInMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] multipledMatrix = new int[cols][rows];
        int multiply = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i % 2 == 0 && matrix[i].length % 2 == 0) {
                    multiply = i * 2;
                    multipledMatrix[i][j] =matrix[multiply][j];
                } else {
                    multiply = i *2;
                    multipledMatrix[i][j] =matrix[multiply][j];
                }
            }

        }
        return multipledMatrix;
    }
}