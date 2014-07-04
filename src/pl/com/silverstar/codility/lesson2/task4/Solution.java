package pl.com.silverstar.codility.lesson2.task4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sylwester.stocki
 */
public class Solution {

    public int solution(int[] A) {
        System.out.println("A = " + Arrays.toString(A));
        int result = 1;
        Map<Integer, Integer> tmp = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                tmp.put(A[i], A[i]);
            }
        }
        System.out.println("tmp = " + tmp.toString());
        for (Integer t : tmp.keySet()) {
//            System.out.println("t = " + t);
            if (t == result) {
                result++;
            } else {
                return result;
            }
        }

        return result;
    }

}
