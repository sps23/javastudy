package pl.com.silverstar.codility.lesson3.task3;

import java.util.Arrays;

/**
 *
 * @author sylwester.stocki
 */
public class Solution {

    public int solution_old(int[] A) {

        int N = A.length;
        if (N <= 2) {
            return 0;
        }

        float minAvg = Float.MAX_VALUE;
        int minAvgIndex = 0;
        float[] tmp = new float[N];
        tmp[0] = A[0];
        for (int p = 0; p < N - 1; p++) {
            float tmpSum = A[p];
            float tmpAvg;
            float minAvgPerP = Float.MAX_VALUE;
            for (int q = p + 1; q < N; q++) {
                tmpSum = tmpSum + A[q];
                tmpAvg = tmpSum / (q - p + 1);
                System.out.println("[" + p + ";" + q + "]" + "tmpSum=" + tmpSum + ";tmpAvg=" + tmpAvg);
                if (tmpAvg < minAvgPerP) {
                    minAvgPerP = tmpAvg;
                    tmp[p] = tmpAvg;
                }
                if (tmpAvg < minAvg) {
                    minAvg = tmpAvg;
                    minAvgIndex = p;
                }
            }
        }
        System.out.println("A=" + Arrays.toString(A));
        System.out.println("tmp=" + Arrays.toString(tmp));
        return minAvgIndex;
    }

    public int solution(int[] A) {
        int N = A.length;
        if (N <= 2) {
            return 0;
        }

        int minAvgIndex = 0;
        int sum = A[0];
        float avg;
        int[] tmpSum = new int[N - 1];
        float[] tmpAvg = new float[N - 1];

        int p = 0;
        int q = p + 1;
        for (; q < N - 1; q++) {
            sum += A[q];
            tmpSum[q - 1] = sum;
            avg = sum / (q - p + 1);
            tmpAvg[q - 1] = avg;
        }
        System.out.println("A=" + Arrays.toString(A));
        System.out.println("tmpSum=" + Arrays.toString(tmpSum));
        System.out.println("tmpAvg=" + Arrays.toString(tmpAvg));

        return minAvgIndex;
    }

}
