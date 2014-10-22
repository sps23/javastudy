package pl.com.silverstar.codility.lesson4.task3;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author sylwester.stocki
 */
public class SolutionTest {

    public SolutionTest() {
    }

    /**
     * Test of solution method, of class Solution.
     */
    @Test
    public void testSolutionExample1() {
        System.out.println("testSolutionExample1");
        int[] A = new int[]{10, 2, 5, 1, 8, 20};
        Solution instance = new Solution();
        int expResult = 1;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolutionExample2() {
        System.out.println("testSolutionExample2");
        int[] A = new int[]{10, 50, 5, 1};
        Solution instance = new Solution();
        int expResult = 0;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolutionOverflow1() {
        System.out.println("testSolutionOverflow2");
        int[] A = new int[6];
        A[0] = 0;
        A[1] = Integer.MIN_VALUE;
        A[2] = Integer.MIN_VALUE;
        A[3] = 5;
        A[4] = 3;
        A[5] = 3;
        Solution instance = new Solution();
        int expResult = 1;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolutionOverflow2() {
        System.out.println("testSolutionOverflow1");
        int[] A = new int[6];
        A[0] = Integer.MAX_VALUE;
        A[1] = Integer.MAX_VALUE;
        A[2] = Integer.MAX_VALUE;
        A[3] = 5;
        A[4] = 3;
        A[5] = 3;
        Solution instance = new Solution();
        int expResult = 1;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

}
