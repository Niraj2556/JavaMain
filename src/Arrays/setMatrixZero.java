package Arrays;

public class setMatrixZero {
        public static void setZeroes(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;

            boolean firstRowZero = false;
            boolean firstColZero = false;

            // Check if the first row and first column should be zeroed
            for (int i = 0; i < rows; i++) {
                if (matrix[i][0] == 0) {
                    firstColZero = true;
                    break;
                }
            }
            for (int j = 0; j < cols; j++) {
                if (matrix[0][j] == 0) {
                    firstRowZero = true;
                    break;
                }
            }

            // Use the first row and first column to mark zero columns and rows
            for (int i = 1; i < rows; i++) {
                for (int j = 1; j < cols; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }

            // Set zeros based on the marked rows and columns
            for (int i = 1; i < rows; i++) {
                for (int j = 1; j < cols; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }

            // Set first row and first column to zero if needed
            if (firstRowZero) {
                for (int j = 0; j < cols; j++) {
                    matrix[0][j] = 0;
                }
            }
            if (firstColZero) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][0] = 0;
                }
            }
        }

        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 0},
                    {4, 8, 6},
                    {0, 8, 9}
            };

            System.out.println("Original Matrix:");
            printMatrix(matrix);

            setZeroes(matrix);

            System.out.println("Matrix after setting zeroes:");
            printMatrix(matrix);
        }

        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
}

