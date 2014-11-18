package pl.com.silverstar.codility.challenge.alpha2010;

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

        int N = A.length;
        int indexNewElem = -1;
        boolean[] T = new boolean[N];

        for (int n = 0; n < N; n++) {
            int index = A[n];
            if (!T[index]) {
                indexNewElem = n;
                T[index] = true;
            }
        }
        // System.out.println("T = " + Arrays.toString(T));
        return indexNewElem;
    }
}
