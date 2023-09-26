public class TransposeMatrix {
    public int[][] transposeMatrix(int[][] matrix) {
        int width = matrix.length;
        int length = matrix[0].length;

        int[][] newMatrix = new int[length][width];
        for(int column = 0; column < length; column++) {
            int[] newRow = new int[width];
            for(int row = 0; row < width; row++) {
                newRow[row] = matrix[row][column];
            }
            newMatrix[column] = newRow;
        }
        return newMatrix;
    }
}
