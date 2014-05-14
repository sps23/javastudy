package pl.com.silverstar.codility.demo;

import java.math.BigInteger;

/**
 *
 * @author Sylwester Stocki <sylwester.stocki.rnd@gmail.com>
 */
public class Solution {

    public int solution(int[] A) {
        // write your code in Java SE 7

        BigInteger sumLeft = BigInteger.ZERO;
        BigInteger sumRight = BigInteger.ZERO;
        BigInteger L[] = new BigInteger[A.length + 1];
        BigInteger R[] = new BigInteger[A.length + 1];

        L[0] = BigInteger.ZERO;
        for (int l = 0; l < A.length; l++) {
            sumLeft = sumLeft.add(BigInteger.valueOf(A[l]));
            L[l + 1] = sumLeft;
        }

        R[A.length] = BigInteger.ZERO;
        for (int r = A.length - 1; r >= 0; r--) {

            sumRight = sumRight.add(BigInteger.valueOf(A[r]));
            R[r] = sumRight;
        }

//        System.out.println("L = " + Arrays.toString(L));
//        System.out.println("R = " + Arrays.toString(R));
        for (int p = 0; p < A.length; p++) {
            if (L[p].compareTo(R[p + 1]) == 0) {
                return p;
            }
        }

        return -1;
    }

}
