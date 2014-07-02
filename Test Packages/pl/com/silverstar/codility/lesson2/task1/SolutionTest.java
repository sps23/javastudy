/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.silverstar.codility.lesson2.task1;

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

    private final int MAX_A = 1000000000;

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

    @Test
    public void testSolutionPositive() {
        System.out.println("testSolutionPositive");
        int[] A = new int[]{4, 1, 3, 2};
        Solution instance = new Solution();
        int result = instance.solution(A);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testSolutionNegative1() {
        System.out.println("testSolutionNegative1");
        int[] A = new int[]{4, 1, 3};
        Solution instance = new Solution();
        int result = instance.solution(A);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSolutionNegative2() {
        System.out.println("testSolutionNegative2");
        int[] A = new int[]{4, 1, 3, 4};
        Solution instance = new Solution();
        int result = instance.solution(A);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSolutionNegative3() {
        System.out.println("testSolutionNegative3");
        int[] A = new int[]{4, 1, 3, 0};
        Solution instance = new Solution();
        int result = instance.solution(A);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSolutionPositiveMaxN() {
        System.out.println("testSolutionPositiveMaxN");
        int[] A = new int[MAX_N];
        for (int i = 0; i < MAX_N; i++) {
            A[i] = i + 1;
        }
        Solution instance = new Solution();
        int result = instance.solution(A);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testSolutionNegativeMaxN() {
        System.out.println("testSolutionNegativeMaxN1");
        int MAX_N = 100000;
        int[] A = new int[MAX_N];
        A[0] = MAX_N;
        for (int i = 1; i < MAX_N - 1; i++) {
            A[i] = i + 1;
        }
        Solution instance = new Solution();
        int result = instance.solution(A);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSolutionNegativeMaxA() {
        System.out.println("testSolutionNegativeMaxA");

        int[] A = new int[MAX_N];
        for (int i = 0; i < MAX_N; i++) {
            A[i] = MAX_A;
        }
        Solution instance = new Solution();
        int result = instance.solution(A);
        Assert.assertEquals(0, result);
    }
}
