package pl.com.silverstar.codility.lesson4.task3;

import java.util.Arrays;

/**
 *
 * @author sylwester.stocki
 */
public class Solution {

    /**
     *
     * Codility result = 100%.
     *
     * @param A
     * @return
     */
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        for (int i = 0; i <= A.length - 3; i++) {
            if ((long) A[i] + (long) A[i + 1] > (long) A[i + 2]) {
                return 1;
            }
        }
        return 0;
    }
}
