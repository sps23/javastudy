package pl.com.silverstar.codility.lesson4.task2;

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
        int N = A.length;

        if (N == 3) {
            return A[N - 1] * A[N - 2] * A[N - 3];
        } else {
            Arrays.sort(A);
//            System.out.println("A = " + Arrays.toString(A));

            int multiPPP = A[N - 1] * A[N - 2] * A[N - 3]; //all maximal positive numbers
            int multiNNP = A[0] * A[1] * A[N - 1]; // negative * negative * positive

            if (multiNNP > multiPPP) {
                return multiNNP;
            } else {
                return multiPPP;
            }
        }
    }
}
