package pl.com.silverstar.codility.tomtom.task3;

/**
 *
 * @author Sylwester Stocki <sylwester.stocki.rnd@gmail.com>
 */
public class Solution3 {

    public int solution(int[][] A) {
        // write your code in Java SE 7

        int nOfCountries = 0;
        for (int ma = 0; ma < A.length; ma++) {
            for (int mb = 0; mb < A[ma].length; mb++) {
                int v = A[ma][mb];
                System.out.println("v = " + v + "[ma;mb] = " + "[" + ma + ";" + mb + "]");
                if (v > 0) {
                    findCountry(v, A, ma, mb);
                    nOfCountries++;
                }
            }
        }

        return nOfCountries;
    }

    private boolean findCountry(int v, int[][] A, int ma, int mb) {
//        System.out.println("A:");
//        for (int i = 0; i < A.length; i++) {
//            for (int j = 0; j < A[i].length; j++) {
//                System.out.print(A[i][j] + "; ");
//            }
//        }
//        System.out.println("\n");
        if (ma < 0 || ma >= A.length) {
            return false;
        }
        if (mb < 0 || mb >= A[ma].length) {
            return false;
        }
        if (A[ma][mb] == v) {
            A[ma][mb] = -1;
            System.out.println("[ma;mb] = " + "[" + ma + ";" + mb + "]");
            System.out.println("A:");
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    System.out.print(A[i][j] + "; ");
                }
            }
            System.out.println("\n");
            findCountry(v, A, ma + 1, mb);
            findCountry(v, A, ma - 1, mb);
            findCountry(v, A, ma, mb + 1);
            findCountry(v, A, ma, mb - 1);
            return true;
        } else {
            return false;
        }
    }
}
