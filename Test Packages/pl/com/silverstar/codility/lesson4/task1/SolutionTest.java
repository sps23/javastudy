/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.silverstar.codility.lesson4.task1;

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

    public SolutionTest() {
    }

    private int MAX_N = 100000;

    private int MAX_A = 1000000;

    private int MIN_A = -1000000;

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
