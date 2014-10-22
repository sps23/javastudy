package pl.com.silverstar.codility.lesson4.task1;

import java.util.HashSet;
import java.util.Set;

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

        Set<Integer> setA = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            setA.add(A[i]);
        }
        return setA.size();
    }
}
