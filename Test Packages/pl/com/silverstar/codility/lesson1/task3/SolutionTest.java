package pl.com.silverstar.codility.lesson1.task3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sylwester Stocki <sylwester.stocki.rnd@gmail.com>
 */
public class SolutionTest {

    public SolutionTest() {
    }

    /**
     * Test of solution method, of class Solution.
     */
    @Test
    public void testSolutioExample() {
        int[] A = new int[]{2, 3, 1, 5};
        Solution instance = new Solution();
        int expResult = 4;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutioMaxN() {
        int MAX_N = 100000;
        int[] A = new int[MAX_N];
        for (int i = 0; i < MAX_N; i++) {
            A[i] = i + 2;
        }
        // System.out.println("A:" + Arrays.toString(A));
        Solution instance = new Solution();
        int expResult = 1;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutioEmpty() {
        int[] A = new int[]{};
        Solution instance = new Solution();
        int expResult = 1;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutioSingle() {
        int[] A = new int[]{1};
        Solution instance = new Solution();
        int expResult = 2;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutioMissingFirstOrLast() {
        int[] A = new int[]{1, 2, 3};
        Solution instance = new Solution();
        int expResult = 4;
        int result = instance.solution(A);
        assertEquals(expResult, result);

        A = new int[]{4, 2, 3};
        expResult = 1;
        result = instance.solution(A);
        assertEquals(expResult, result);
    }

}
