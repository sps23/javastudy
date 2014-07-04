/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.silverstar.codility.lesson2.task3;

import java.util.Arrays;
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

    private final int MAX_M = 100000;

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
        int N = 5;
        int[] A = new int[]{3, 4, 4, 6, 1, 4, 4};
        Solution instance = new Solution();
        int[] expResult = new int[]{3, 2, 2, 4, 2};
        int[] result = instance.solution(N, A);
        System.out.println("expResult = " + Arrays.toString(expResult));
        System.out.println("result = " + Arrays.toString(result));
        Assert.assertArrayEquals(expResult, result);
    }

    @Test
    public void testSolutionMaxIncrease() {
        System.out.println("testSolutionMaxIncrease");
        int N = 1000;
        int[] A = new int[2000];
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                A[i] = (i + 1) % N;
            } else {
                A[i] = N + 1;
            }
        }
        Solution instance = new Solution();
        int[] expResult = new int[N];
        for (int n = 0; n < N; n++) {
            expResult[n] = N;
        }
        int[] result = instance.solution(N, A);
        System.out.println("result = " + Arrays.toString(result));
        Assert.assertArrayEquals(expResult, result);
    }

    @Test
    public void testSolutionMaxMMaxN() {
        System.out.println("testSolutionMaxMMaxN");
        int N = MAX_N;
        int[] A = new int[MAX_M];
        for (int i = 0; i < A.length; i++) {
            A[i] = N + 1;
        }
        Solution instance = new Solution();
        int[] expResult = new int[N];
        int[] result = instance.solution(N, A);
        System.out.println("result = " + Arrays.toString(result));
        Assert.assertArrayEquals(expResult, result);
    }

}
