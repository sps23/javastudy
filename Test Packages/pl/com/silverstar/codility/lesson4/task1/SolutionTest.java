package pl.com.silverstar.codility.lesson4.task1;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author sylwester.stocki
 */
public class SolutionTest {

    public SolutionTest() {
    }

    private final int MAX_N = 100000;

    private final int MAX_A = 1000000;

    private final int MIN_A = -1000000;

    /**
     * Test of solution method, of class Solution.
     */
    @Test
    public void testSolutionExample() {
        System.out.println("testSolutionExample");
        int[] A = new int[]{2, 1, 1, 2, 3, 1};
        Solution instance = new Solution();
        int expResult = 3;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolutionMaxN() {
        System.out.println("testSolutionMaxN");
        int[] A = new int[MAX_N];
        for (int i = 0; i < MAX_N; i++) {
            A[i] = 33;
        }
        Solution instance = new Solution();
        int expResult = 1;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolutionMaxNMinA() {
        System.out.println("testSolutionMaxNMinA");
        int[] A = new int[MAX_N];
        for (int i = 0; i < MAX_N; i++) {
            A[i] = MIN_A;
        }
        Solution instance = new Solution();
        int expResult = 1;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolutionMaxNMaxA() {
        System.out.println("testSolutionMaxNMaxA");
        int[] A = new int[MAX_N];
        for (int i = 0; i < MAX_N; i++) {
            A[i] = MAX_A;
        }
        Solution instance = new Solution();
        int expResult = 1;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }
}
