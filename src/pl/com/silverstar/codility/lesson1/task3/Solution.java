package pl.com.silverstar.codility.lesson1.task3;

/**
 *
 * @author Sylwester Stocki <sylwester.stocki.rnd@gmail.com>
 */
public class Solution {

    int solution(int A[]) {

        int sum = 0;
        for (int i = 1; i <= A.length + 1; i++) {
            sum += i;
        }
        for (int j = 0; j < A.length; j++) {
            sum -= A[j];
        }
        return sum;

    }

}
