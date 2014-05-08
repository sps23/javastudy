package pl.com.silverstar.codility.lesson1.task2;

/**
 *
 * @author Sylwester Stocki <sylwester.stocki.rnd@gmail.com>
 */
public class Solution {

    public int solution(int X, int Y, int D) {
        int dist = (Y - X);
        int result = dist / D;
        if ((dist % D) == 0) {
            return result;
        } else {
            return result + 1;
        }
    }
}
