/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.silverstar.codility.lesson2.task2;

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

    private final int MAX_X = 100000;

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
        int X = 5;
        int[] A = new int[]{1, 3, 1, 4, 2, 3, 5, 4};
        Solution instance = new Solution();
        int result = instance.solution(X, A);
        Assert.assertEquals(6, result);
    }

    @Test
    public void testSolutionPositive1() {
        System.out.println("testSolutionPositive1");
        int X = 1;
        int[] A = new int[]{1};
        Solution instance = new Solution();
        int result = instance.solution(X, A);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSolutionPositiveMaxN() {
        System.out.println("testSolutionPositiveMaxN");
        int X = 2;
        int[] A = new int[MAX_N];
        for (int i = 0; i < MAX_N - 1; i++) {
            A[i] = 1;
        }
        A[MAX_N - 1] = 2;
        Solution instance = new Solution();
        int result = instance.solution(X, A);
        Assert.assertEquals(MAX_N - 1, result);
    }

    @Test
    public void testSolutionPositiveMaxX() {
        System.out.println("testSolutionPositiveMaxX");
        int X = MAX_X;
        int[] A = new int[MAX_N];
        for (int i = 0; i < MAX_N; i++) {
            A[i] = i + 1;
        }
        Solution instance = new Solution();
        int result = instance.solution(X, A);
        Assert.assertEquals(MAX_N - 1, result);
    }

    @Test
    public void testSolutionNegative() {
        System.out.println("testSolutionNegative");
        int X = 5;
        int[] A = new int[]{1, 3, 1, 4, 2, 3, 4, 4};
        Solution instance = new Solution();
        int result = instance.solution(X, A);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testSolutionNegativeMaxN() {
        System.out.println("testSolutionNegativeMaxN");
        int X = 2;
        int[] A = new int[MAX_N];
        for (int i = 0; i < MAX_N; i++) {
            A[i] = 1;
        }
        Solution instance = new Solution();
        int result = instance.solution(X, A);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testSolutionNegativeMaxX() {
        System.out.println("testSolutionNegativeMaxX");
        int X = MAX_X;
        int[] A = new int[MAX_N];
        for (int i = 0; i < MAX_N; i++) {
            A[i] = MAX_X - 1;
        }
        Solution instance = new Solution();
        int result = instance.solution(X, A);
        Assert.assertEquals(-1, result);
    }

}
