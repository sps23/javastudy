package pl.com.silverstar.codility.lesson2.task4;

/**
 *
 * @author sylwester.stocki
 */
public class Solution {

    public int solution(int[] A) {
        int N = A.length;
        boolean[] tmp = new boolean[N];

        for (int i = 0; i < A.length; i++) {
            final int a = A[i];
            if (a > 0 && a <= N) {
                tmp[a - 1] = true;
            }
        }

        for (int j = 0; j < tmp.length; j++) {
            if (!tmp[j]) {
                return j + 1;
            }
        }

        return N + 1;
    }

}
