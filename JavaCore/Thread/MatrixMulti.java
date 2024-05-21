package Thread;

class MatrixMulti extends Thread {
    private int[][] matrix1;
    private int[][] matrix2;
    private int[][] result;
    private int startIndex;
    private int endIndex;

    public MatrixMulti(int[][] matrix1, int[][] matrix2, int[][] result, int startIndex, int endIndex) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.result = result;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        int cols = matrix2[0].length;

        for (int i = startIndex; i <= endIndex; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
    }
}

