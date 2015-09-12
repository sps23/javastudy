/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.silverstar.codility.lesson3.task3;

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
    private final int MIN_A = -10000;
    private final int MAX_A = 10000;

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
    public void testSolutionExample() {
        System.out.println("testSolutionExample");
        int[] A = new int[]{4, 2, 2, 5, 1, 5, 8};
        Solution instance = new Solution();
        int expResult = 1;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolutionExample_Min3Seq() {
        System.out.println("testSolutionExample_Min3Seq");
        int[] A = new int[]{9, 2, 7, 5, 7, -1, 5, -3};
        Solution instance = new Solution();
        int expResult = 1;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolution_MaxN_MaxA() {
        System.out.println("testSolution_MaxN_MaxA");
        int[] A = new int[MAX_N];
        for (int n = 0; n < MAX_N; n++) {
            A[n] = MAX_A;
        }
        Solution instance = new Solution();
        int expResult = 0;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolution_MaxN_MinA() {
        System.out.println("testSolution_MaxN_MinA");
        int[] A = new int[MAX_N];
        for (int n = 0; n < MAX_N; n++) {
            A[n] = MIN_A;
        }
        Solution instance = new Solution();
        int expResult = 0;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

}
