/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.silverstar.codility.tomtom.task1;

import java.math.BigInteger;
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
public class Solution1Test {

    public Solution1Test() {
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
     * Test of solution method, of class Solution1.
     */
    @Test
    public void testSolutionExample() {
        int N = 17;
        Solution1 instance = new Solution1();
        int expResult = 5;
        int result = instance.solution(N);
        System.out.println("testSolutionExample, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionMinN() {
        int N = 0;
        Solution1 instance = new Solution1();
        int expResult = 0;
        int result = instance.solution(N);
        System.out.println("testSolutionMinN, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionMaxN() {
        int N = 1000000000;
        Solution1 instance = new Solution1();
        int expResult = 0;
        int sum = 0;
        for (int i = 0; i <= N; i++) {
            sum += i;
            if (sum >= N) {
                expResult = i - 1;
                break;
            }
        }
        int result = instance.solution(N);
        System.out.println("testSolutionMaxN, result = " + result);
        assertEquals(expResult, result);
    }

    /**
     * Test of function method, of class Solution1.
     */
    @Test
    public void testFunction() {
        System.out.println("function");
        int k = 5;
//        Solution1 instance = new Solution1();
//        BigInteger expResult = BigInteger.valueOf(15);
//        BigInteger result = instance.function(k);
//        assertTrue(expResult.compareTo(result) == 0);
        Solution1 instance = new Solution1();
        int expResult = 15;
        int result = instance.function(k);
        assertEquals(expResult, result);
    }

}
