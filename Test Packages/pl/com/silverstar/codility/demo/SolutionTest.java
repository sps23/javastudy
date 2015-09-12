/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.silverstar.codility.demo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Sylwester Stocki <sylwester.stocki.rnd@gmail.com>
 */
public class SolutionTest {

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
        int[] A = new int[]{-7, 1, 5, 2, -4, 3, 0};
        Solution instance = new Solution();
        int expResult = 3;
        int result = instance.solution(A);
        System.out.println("testSolutionExample, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionEmpty() {
        int[] A = new int[]{};
        Solution instance = new Solution();
        int expResult = -1;
        int result = instance.solution(A);
        System.out.println("testSolutionEmpty, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionOne() {
        int[] A = new int[]{0};
        Solution instance = new Solution();
        int expResult = 0;
        int result = instance.solution(A);
        System.out.println("testSolutionOne, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionMaxA() {
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        int[] A = new int[]{Integer.MAX_VALUE, 12, Integer.MAX_VALUE};
        Solution instance = new Solution();
        int expResult = 1;
        int result = instance.solution(A);
        System.out.println("testSolutionMaxA, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionMaxN() {
        final int MAX_N = 10000000;
        System.out.println("MAX_N = " + MAX_N);
        int[] A = new int[MAX_N];
        A[0] = 1;
        A[1] = 0;
        A[2] = 1;
        for (int i = 3; i < MAX_N; i++) {
            A[i] = 0;
        }
        Solution instance = new Solution();
        int expResult = 1;
        int result = instance.solution(A);
        System.out.println("testSolutionMaxN, result = " + result);
        assertEquals(expResult, result);

    }

}
