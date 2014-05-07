package pl.com.silverstar.codility.lesson1.task1;

/**
 *
 * @author Sylwester Stocki <sylwester.stocki.rnd@gmail.com>
 */
public class Solution {

    public static final int MIN_N = 2;
    public static final int MAX_N = 100000;

    public static final int MIN_A = -1000;
    public static final int MAX_A = 1000;

    public int solution(int[] A) {
        // write your code in Java SE 7

        if (A == null) {
            return -1;
        } else {
            if (A.length > MAX_N || A.length < MIN_N) {
                return -2;
            }
        }

        int[] T = new int[A.length];
        T[0] = A[0];
        for (int t = A.length - 1; t > 0; t--) {
            if (t == A.length - 1) {
                T[t] = A[t];
            } else {
                T[t] = A[t] + T[t + 1];
            }
        }

        //System.out.println("T = " + Arrays.toString(T));
        int sum = Math.abs(T[0] - T[1]);
        int tmp_sum;
        if (T.length > 2) {
            for (int i = 1; i < T.length - 1; i++) {
                T[i] = T[i - 1] + (T[i] - T[i + 1]);
                tmp_sum = Math.abs(T[i] - T[i + 1]);
                if (tmp_sum < sum) {
                    sum = tmp_sum;
                }
            }
        }

        return sum;
    }

}
