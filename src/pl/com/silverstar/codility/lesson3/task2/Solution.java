package pl.com.silverstar.codility.lesson3.task2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sylwester.stocki
 */
public class Solution {

    private final Map<Character, Integer> impactFactor = new HashMap<>();

    {
        impactFactor.put('A', 1);
        impactFactor.put('C', 2);
        impactFactor.put('G', 3);
        impactFactor.put('T', 4);
    }

    public int[] solution(String S, int[] P, int[] Q) {
        int M = P.length;
        int[] answer = new int[M];

        for (int m = 0; m < M; m++) {
            int p = P[m];
            int q = Q[m];
            int min = 4;
            for (int i = p; i <= q; i++) {
                int impactFactorTmp = impactFactor.get(S.charAt(i));
                if (impactFactorTmp == 1) {
                    min = 1;
                    break;
                } else {
                    if (impactFactorTmp < min) {
                        min = impactFactorTmp;
                    }
                }
            }
            answer[m] = min;
        }
        return answer;
    }

}
