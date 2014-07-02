package pl.com.silverstar.codility.lesson2.task1;

/**
 *
 * @author sylwester.stocki
 */
public class Solution {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;

        boolean[] AA = new boolean[N];

        for (int i = 0; i < N; i++) {
            int a = A[i];
            if (a < 1 || a > N) {
                return 0;
            }
            if (AA[a - 1]) {
                return 0;
            } else {
                AA[a - 1] = true;
            }
        }

        for (int i = 0; i < N; i++) {
            if (!AA[i]) {
                return 0;
            }
        }

        return 1;
    }

}
