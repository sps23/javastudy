package pl.com.silverstar.codility.tomtom.task2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Sylwester Stocki <sylwester.stocki.rnd@gmail.com>
 */
public class Solution2 {

    public int solution(int[] A) {
        // write your code in Java SE 7

        int N = A.length;
        if (N == 0) {
            return 0;
        } else {
            Map<Integer, Boolean> visited = new HashMap<>();
            visited.put(0, Boolean.TRUE);
            int M = 0 + A[0];
            while (M >= 0 && M < N) {
                if (visited.containsKey(M)) {
                    break;
                } else {
                    visited.put(M, Boolean.TRUE);
                    M = M + A[M];
                }
            }
            return N - visited.keySet().size();
        }
    }

}
