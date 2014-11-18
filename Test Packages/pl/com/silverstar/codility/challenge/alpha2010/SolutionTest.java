package pl.com.silverstar.codility.challenge.alpha2010;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author sylwester.stocki
 */
public class SolutionTest {

    public SolutionTest() {
    }

    @Test
    public void testSolutionExample() {
        int[] A = new int[]{2, 2, 1, 0, 1};
        Solution instance = new Solution();
        int expResult = 3;
        int result = instance.solution(A);
        System.out.println("testSolutionExample, result = " + result);
        assertEquals(expResult, result);
    }

}
