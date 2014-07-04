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
    public void testSolutionMaxN() {
        System.out.println("testSolutionMaxN");
        int[] A = new int[MAX_N];
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
        }
        Solution instance = new Solution();
        int expResult = MAX_N + 1;
        int result = instance.solution(A);
        Assert.assertEquals(expResult, result);
    }

}
