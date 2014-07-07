/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.silverstar.codility.lesson2.task4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author sylwester.stocki
 */
public class SolutionTest {

    private final int MAX_N = 100000;

    private final int MAX_A = Integer.MAX_VALUE;

    private final int MIN_A = Integer.MIN_VALUE;

    public SolutionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of solution method, of class Solution.
     */
    @Test
    public void testSolution() {
        System.out.println("testSolution");
        int[] A = new int[]{1, 3, 6, 4, 1, 2};
        Solution instance = new Solution();
        int expResult = 5;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolutionSmallA() {
        System.out.println("testSolutionSmallA");
        int[] A = new int[1000];
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.MIN_VALUE;
        }
        Solution instance = new Solution();
        int expResult = 1;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolutionBigA() {
        System.out.println("testSolutionBigA");
        int[] A = new int[1000];
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.MAX_VALUE;
        }
        Solution instance = new Solution();
        int expResult = 1;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolutionMaxN() {
        System.out.println("testSolutionMaxN");
        int N = MAX_N;
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
        }
        A[N - 1] = 1;
        Solution instance = new Solution();
        int expResult = MAX_N;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolutionMaxNAll() {
        System.out.println("testSolutionMaxNAll");
        int N = MAX_N;
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
        }
        Solution instance = new Solution();
        int expResult = MAX_N + 1;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolutionSingle() {
        System.out.println("testSolutionSingle");
        int N = MAX_N;
        int[] A = new int[]{1};
        Solution instance = new Solution();
        int expResult = 2;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

}
