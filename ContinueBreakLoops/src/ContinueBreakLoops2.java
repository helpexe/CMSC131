import java.util.Arrays;

public class ContinueBreakLoops2 {
    public static void main(String[] args) {
        // 1D array
        int[][] matrix = {{1, 3, 2, 11, 10, 12},
                          {5, 4, 6, 13, 15, 14},
                          {9, 8, 7, 18, 17, 16}};

        // Find the indices of numbers 10, 6, and 18 that are in the 1st, 2nd, and 3rd
        // rows of matrix, respectively.
        int[] toFind = {10, 6, 18};
        int[][] indices = new int[3][2];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == toFind[i]) {
                    indices[i] = new int[]{i, j};
                    // This break statement only breaks from the innermost loop
                    // (the one using j as a variable)
                    break;
                }
            }
        }

        // Output the indices of the given numbers
        System.out.println("Indices:");
        for(int i = 0; i < matrix.length; i++) {
            // Note:
            System.out.println(toFind[i] + " is located at " + Arrays.toString(indices[i]));
        }
    }
}
