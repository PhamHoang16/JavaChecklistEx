package Lambda;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        LambdaSum lambdaSum = (a, b) -> a + b;
        //System.out.println(lambdaSum.sum(6,6));
        int[] arr = {2,7,11,15};
        int[] res = Solution.twoSum(arr, 9);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i : nums) {
            arr.add(i);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (Integer i : arr) {
            if (arr.contains(target - i) && !res.contains(arr.indexOf(i)) && !res.contains(arr.indexOf(target - i))) {
                res.add(arr.indexOf(i));
                res.add(arr.indexOf(target - i));
            }
        }
        int[] resArr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArr[i] = res.get(i);
        }
        return resArr;
    }
}
