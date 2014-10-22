package pl.com.silverstar.codility.lesson4.task4;

/**
 *
 * @author sylwester.stocki
 */
public class Solution {

    /**
     *
     * Codility result = 75%. arithmetic overflow failed, time complexity O(N**2).
     *
     * @param A
     * @return
     */
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
        int N = A.length;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                long iMax = i + A[i];
                long jMin = j - A[j];
                if (iMax >= jMin) {
//                    System.out.println("[" + i + ";" + j + "]");
                    result++;
                }
            }
        }
        if (result > 10000000) {
            return -1;
        } else {
            return result;
        }
    }
}
