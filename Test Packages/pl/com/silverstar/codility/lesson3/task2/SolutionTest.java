/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.silverstar.codility.lesson3.task2;

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
        String S = "CAGCCTA";
        int[] P = new int[]{2, 5, 0};
        int[] Q = new int[]{4, 5, 6,};
        Solution instance = new Solution();
        int[] expResult = new int[]{2, 4, 1};
        int[] result = instance.solution(S, P, Q);
        Assert.assertArrayEquals(expResult, result);
    }

}
