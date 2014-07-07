package pl.com.silverstar.codility.lesson3.task1;

/**
 *
 * @author sylwester.stocki
 */
public class Solution {

    public int solution(int[] A) {
        // write your code in Java SE 8
        final int MAX_PASS = 1000000000;

        int nOfZeros = 0;
        int nOfPassingCars = 0;
        for (int i = 0; i < A.length; i++) {
            int a = A[i];
            if (a == 0) {
                nOfZeros++;
            } else {
                nOfPassingCars += nOfZeros;
                if (nOfPassingCars > MAX_PASS) {
                    return -1;
                }
            }
        }

        return nOfPassingCars;
    }

}
