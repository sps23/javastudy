/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.silverstar.codility.lesson1.task2;

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
        System.out.println("solution");
        int x = 10;
        int y = 85;
        int d = 30;
        Solution instance = new Solution();
        int expResult = 3;
        int result = instance.solution(x, y, d);
        assertEquals(expResult, result);

    }

    @Test
    public void testSolutionNoJump() {
        int x = 20;
        int y = 20;
        int d = 1;
        int expResult = 0;
        int result = new Solution().solution(x, y, d);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionManyJumps() {
        int x = 1;
        int y = 1000000;
        int d = 1;
        int expResult = 999999;
        int result = new Solution().solution(x, y, d);
        assertEquals(expResult, result);
    }
}
