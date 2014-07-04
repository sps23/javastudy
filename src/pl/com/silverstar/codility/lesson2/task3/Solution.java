package pl.com.silverstar.codility.lesson2.task3;

/**
 *
 * @author sylwester.stocki
 */
public class Solution {

    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maxValueSet = 0;
        int maxValue = 0;

        for (int K = 0; K < A.length; K++) {
            final int X = A[K];
            if (X == N + 1) {
                maxValueSet = maxValue;
            } else {
                if (counters[X - 1] < maxValueSet) {
                    counters[X - 1] = maxValueSet;
                }
                counters[X - 1]++;
                if (counters[X - 1] > maxValue) {
                    maxValue = counters[X - 1];
                }
            }
        }
        for (int n = 0; n < counters.length; n++) {
            if (counters[n] < maxValueSet) {
                counters[n] = maxValueSet;
            }
        }

        return counters;
    }

}
