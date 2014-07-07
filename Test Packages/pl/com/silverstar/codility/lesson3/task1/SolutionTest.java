/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.silverstar.codility.lesson3.task1;

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
        int[] A = new int[]{0, 1, 0, 1, 1};
        Solution instance = new Solution();
        int expResult = 5;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolutionNegative0() {
        System.out.println("testSolutionNegative0");
        int[] A = new int[MAX_N];
        for (int i = 0; i < A.length; i++) {
            A[i] = 0;
        }
        Solution instance = new Solution();
        int expResult = 0;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolutionNegative1() {
        System.out.println("testSolutionNegative1");
        int[] A = new int[MAX_N];
        for (int i = 0; i < A.length; i++) {
            A[i] = 1;
        }
        Solution instance = new Solution();
        int expResult = 0;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSolution0_1() {
        System.out.println("testSolution0_1");
        int[] A = new int[MAX_N];
        int expResult = 0;
        for (int i = 0; i < A.length; i++) {
            A[i] = i % 2;
            if (i % 2 == 1) {
                expResult += expResult + 1;
            }
        }
        System.out.println("expResult = " + expResult);
        Solution instance = new Solution();

        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

}
