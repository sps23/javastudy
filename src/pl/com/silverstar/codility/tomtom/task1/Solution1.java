package pl.com.silverstar.codility.tomtom.task1;

/**
 *
 * @author Sylwester Stocki <sylwester.stocki.rnd@gmail.com>
 */
public class Solution1 {

    public int solution(int N) {
        // write your code in Java SE 7

//        for (int l = 0; true; l++) {
//            BigInteger functionL = function(l);
//            if (functionL.compareTo(BigInteger.valueOf(N)) >= 0) {
//                return l - 1;
//            }
//        }
        if (N == 0) {
            return 0;
        }
        for (int l = 0; true; l++) {
            int functionL = function(l);
            if (functionL >= N) {
                return l - 1;
            }
        }
    }

    public int function(int k) {
//        if (k == 0) {
//            return 0;
//        } else {
//            return function(k - 1) + k;
//        }

        int result = 0;
        for (int i = 0; i <= k; i++) {
            result += i;
        }
        return result;
//        BigInteger result = BigInteger.ZERO;
//        for (int i = 0; i <= k; i++) {
//            result = result.add(BigInteger.valueOf(i));
//        }
//        return result;
    }

}
