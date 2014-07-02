package pl.com.silverstar.codility.lesson2.task2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sylwester.stocki
 */
public class Solution {

    public int solution(int X, int[] A) {
        // write your code in Java SE 8

        Map<Integer, Integer> AA = new HashMap<>(X);
        for (int i = 1; i <= X; i++) {
            AA.put(i, i);
        }

        for (int i = 0; i < A.length; i++) {
            if (AA.containsKey(A[i])) {
                AA.remove(A[i]);
            }
            if (AA.isEmpty()) {
                return i;
            }
        }

        return -1;
    }
}
