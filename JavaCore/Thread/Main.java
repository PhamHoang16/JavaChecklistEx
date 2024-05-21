package Thread;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
//        int[] arr = {5, 6, 1 , 3, 9, 0, 7, 10, 15, 64, 19};
//        int mid = arr.length/2;
//
//
//        Thread th1 = new Thread1(Arrays.copyOfRange(arr, 0, mid));
//        Thread th2 = new Thread(new Thread2(Arrays.copyOfRange(arr, mid+1, arr.length-1)));
//
//        th1.start();
//        th1.join();
//        th2.start();

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int[][] result = new int[3][3];

        Thread[] threads = new Thread[2];
        int segmentSize = 3 / 2;

        for (int i = 0; i < 2; i++) {
            int startIndex = i * segmentSize;
            int endIndex = (i == 2 - 1) ? 3 - 1 : (startIndex + segmentSize - 1);
            threads[i] = new Thread(new MatrixMulti(matrix1, matrix2, result, startIndex, endIndex));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Result:");
        for (int[] row : result) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
