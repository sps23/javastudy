/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.silverstar.codility.challenge.sulphur2014;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author sylwester.stocki
 */
public class SolutionTest {

    public SolutionTest() {
    }

    /**
     * Test of solution method, of class Solution.
     */
    @Test
    public void testSolutionExample1() {
        int[] A = new int[]{5, 3, 6, 3, 3};
        int[] B = new int[]{2, 3, 1, 1, 2};
        int[] C = new int[]{-1, 0, -1, 0, 3};
        Solution instance = new Solution();
        int expResult = 3;
        int result = instance.solution(A, B, C);
        System.out.println("testSolutionExample1, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionExample2() {
        int[] A = new int[]{4, 3, 1};
        int[] B = new int[]{2, 2, 1};
        int[] C = new int[]{-1, 0, 1};
        Solution instance = new Solution();
        int expResult = 2;
        int result = instance.solution(A, B, C);
        System.out.println("testSolutionExample2, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionEmpty() {
        int[] A = new int[]{};
        int[] B = new int[]{};
        int[] C = new int[]{};
        Solution instance = new Solution();
        int expResult = 0;
        int result = instance.solution(A, B, C);
        System.out.println("testSolutionEmpty, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionOne() {
        int[] A = new int[]{5};
        int[] B = new int[]{2};
        int[] C = new int[]{-1};
        Solution instance = new Solution();
        int expResult = 1;
        int result = instance.solution(A, B, C);
        System.out.println("testSolutionOne, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionThree() {
        int[] A = new int[]{5, 3, 6};
        int[] B = new int[]{2, 3, 1};
        int[] C = new int[]{-1, 0, -1};
        Solution instance = new Solution();
        int expResult = 3;
        int result = instance.solution(A, B, C);
        System.out.println("testSolutionThree, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionMAX_N() {
        int MAX_N = 5000;
        int[] A = new int[MAX_N];
        int[] B = new int[MAX_N];
        int[] C = new int[MAX_N];

        for (int i = 0; i < MAX_N; i++) {
            A[i] = MAX_N;
            B[i] = 1;
            C[i] = i - 1;
        }

        Solution instance = new Solution();
        int expResult = MAX_N;
        int result = instance.solution(A, B, C);
        System.out.println("testSolutionMAX_N, result = " + result);
        assertEquals(expResult, result);
    }
}
