package Thread;

import java.util.Arrays;

import static java.lang.Thread.sleep;

public class Thread2 implements Runnable {
    int arr[];



    public Thread2(int[] arr) {
        this.arr = arr;

    }

    @Override
    public void run() {
        //2. find even list
        /*
        for (int i = 0; i < 21; i++) {
            if (i % 2 == 0) System.out.println("even number " i);
        }*/
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
