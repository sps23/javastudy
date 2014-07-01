/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.silverstar.codility.tomtom.task2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sylwester Stocki <sylwester.stocki.rnd@gmail.com>
 */
public class Solution2Test {

    public Solution2Test() {
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
     * Test of solution method, of class Solution2.
     */
    @Test
    public void testSolutionExample1() {
        int[] A = new int[]{1, 2, 3};
        Solution2 instance = new Solution2();
        int expResult = 1;
        int result = instance.solution(A);
        System.out.println("testSolutionExample1, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionExample2() {
        int[] A = new int[]{3, -5, 0, -1, -3};
        Solution2 instance = new Solution2();
        int expResult = 2;
        int result = instance.solution(A);
        System.out.println("testSolutionExample2, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionLoop() {
        int[] A = new int[]{4, 0, 0, 0, -4};
        Solution2 instance = new Solution2();
        int expResult = 3;
        int result = instance.solution(A);
        System.out.println("testSolutionExample2, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionNegative1() {
        int[] A = new int[]{4, 1, 1, 2, -3, -6, 9};
        Solution2 instance = new Solution2();
        int expResult = 1;
        int result = instance.solution(A);
        System.out.println("testSolutionNegative1, result = " + result);
        assertEquals(expResult, result);
    }

}
