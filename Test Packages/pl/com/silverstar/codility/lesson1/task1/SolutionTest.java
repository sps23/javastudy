/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.silverstar.codility.lesson1.task1;

import pl.com.silverstar.codility.lesson1.task1.Solution;
import java.util.Arrays;
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

    @Test
    public void testSolution() {
        System.out.println("\n\ntestSolution()\n");
        int[] A = new int[]{3, 1, 2, 4, 3};
        System.out.println("A = " + Arrays.toString(A));
        Solution instance;
        instance = new Solution();
        int expResult = 1;
        int result = instance.solution(A);
        System.out.println("result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionMaxN() {
        System.out.println("\n\ntestSolutionMaxN()\n");
        int[] A = new int[Solution.MAX_N];
        for (int i = 0; i < A.length; i++) {
            A[i] = 23;
        }
        System.out.println("A = " + Arrays.toString(A));
        Solution instance;
        instance = new Solution();
        int expResult = 0;
        int result = instance.solution(A);
        System.out.println("result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionMaxN_MaxA() {
        System.out.println("\n\testSolutionMaxN_MaxA()\n");
        int[] A = new int[Solution.MAX_N];
        for (int i = 0; i < A.length; i++) {
            A[i] = Solution.MAX_A;
        }
        System.out.println("A = " + Arrays.toString(A));
        Solution instance;
        instance = new Solution();
        int expResult = 0;
        int result = instance.solution(A);
        System.out.println("result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionMaxN_MinA() {
        System.out.println("\n\testSolutionMaxN_MaxA()\n");
        int[] A = new int[Solution.MAX_N];
        for (int i = 0; i < A.length; i++) {
            A[i] = Solution.MIN_A;
        }
        System.out.println("A = " + Arrays.toString(A));
        Solution instance;
        instance = new Solution();
        int expResult = 0;
        int result = instance.solution(A);
        System.out.println("result = " + result);
        assertEquals(expResult, result);
    }

}
