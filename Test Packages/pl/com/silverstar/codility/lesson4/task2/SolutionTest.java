package pl.com.silverstar.codility.lesson4.task2;

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
    public void testSolutionExample() {
        System.out.println("testSolutionExample");
        int[] A = new int[]{-3, 1, 2, -2, 5, 6};
        Solution instance = new Solution();
        int expResult = 60;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolution1() {
        System.out.println("testSolution1");
        int[] A = new int[]{3, 1, 2};
        Solution instance = new Solution();
        int expResult = 6;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolution2() {
        System.out.println("testSolution2");
        int[] A = new int[1000];
        for (int i = 0; i < 1000; i++) {
            if (i < 500) {
                A[i] = -2;
            } else {
                A[i] = 1;
            }
        }
        Solution instance = new Solution();
        int expResult = 4;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolution3() {
        System.out.println("testSolution2");
        int[] A = new int[2003];
        for (int i = 0; i < 2000; i++) {
            A[i] = i % 21 - 10;
        }
        A[2000] = -1000;
        A[2001] = 500;
        A[2002] = -1;
        Solution instance = new Solution();
        int expResult = 5000000;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

}
