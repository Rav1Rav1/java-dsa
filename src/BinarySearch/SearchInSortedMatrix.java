package BinarySearch;

public class SearchInSortedMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start from the top-right corner
        int row = 0;
        int col = cols - 1;

        // Move left or down based on comparison
        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Element found at: (" + row + ", " + col + ")");
                return true;
            } else if (matrix[row][col] > target) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }

        System.out.println("Element not found in the matrix.");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };

        int target = 29;

        searchMatrix(matrix, target);
    }

}
