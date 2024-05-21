package Thread;

import java.util.Arrays;

public class Thread1 extends Thread {
    int[] arr;


    public Thread1(int[] arr) {
        this.arr = arr;

    }


    @Override
    public void run() {
        //System.out.println("Hello World");

        //2. find odd list
        /**
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 1) System.out.println("odd number": i);
        }
         */
        Arrays.sort(arr);
        for (int a : arr) {
            System.out.println(a);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}