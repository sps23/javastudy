package pl.com.silverstar.codility.challenge.beta2010;

import java.math.BigInteger;

/**
 * 
 * @author sylwester.stocki
 *
 */
public class Solution {

    public final static int MAX_N = 100000;
    public final static int MAX_A = 2147483647;
    public final static int MAX_INTERSECTIONS = 10000000;

    /**
     * Codility result = 50%.
     * Correctness tests 100%, performance tests 0%.
     * Detected time complexity: O(N**2).
     * 
     * @param A
     * @return
     */
    public int solution(int[] A) {
        int N = A.length;
        if(N > MAX_N) return -1;
        int nOfIntersections = 0;
        for (int a = 0; a < N; a++) {
            for (int b = a + 1; b < N; b++) {
                if (discIntersect(a, A[a], b, A[b]))
                    nOfIntersections++;
                if (nOfIntersections > MAX_INTERSECTIONS)
                    return -1;
            }
        }
        return nOfIntersections;
    }

    private boolean discIntersect(int o1, int r1, int o2, int r2) {
        BigInteger d = new BigInteger(Integer.toString(o2)).subtract(new BigInteger(Integer.toString(o1))).abs();
        BigInteger rd = new BigInteger(Integer.toString(r1)).add(new BigInteger(Integer.toString(r2)));
        //System.out.println("(d,rd) = " + "(" + d + "; " + rd + ").");
        return (d.compareTo(rd) <= 0);
    }
}
