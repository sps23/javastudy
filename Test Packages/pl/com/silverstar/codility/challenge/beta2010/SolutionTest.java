package pl.com.silverstar.codility.challenge.beta2010;

import static org.junit.Assert.*;

import org.junit.Test;
import pl.com.silverstar.codility.challenge.beta2010.Solution;

public class SolutionTest {

    public SolutionTest() {
    }

    @Test
    public void testSolutionExample() {
        int[] A = new int[] { 1, 5, 2, 1, 4, 0 };
        Solution instance = new Solution();
        int expResult = 11;
        int result = instance.solution(A);
        System.out.println("testSolutionExample, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionAllAdjecent() {
        int expResult = 0;
        int N = 10;
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = i + 1;
            expResult += i;
        }
        Solution instance = new Solution();
        int result = instance.solution(A);
        System.out.println("testSolutionAllAdjecent, result = " + result);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSolutionTooManyElements() {
        int N = Solution.MAX_N + 1;
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = 23;
        }
        int expResult = -1;
        Solution instance = new Solution();
        int result = instance.solution(A);
        System.out.println("testSolutionTooManyElements, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testBigNumbers() {
        int[] A = new int[] { Solution.MAX_A, Solution.MAX_A, Solution.MAX_A, Solution.MAX_A };
        Solution instance = new Solution();
        int expResult = 6;
        int result = instance.solution(A);
        System.out.println("testBigNumbers, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testBigNumberOfIntersections() {
        int[] A = new int[Solution.MAX_N];
        for (int i = 0; i < A.length; i++) {
            A[i] = Solution.MAX_A;
        }
        Solution instance = new Solution();
        int expResult = -1;
        int result = instance.solution(A);
        System.out.println("testBigNumberOfIntersections, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionNoIntersections() {
        int[] A = new int[] { 1 };
        Solution instance = new Solution();
        int expResult = 0;
        int result = instance.solution(A);
        System.out.println("testSolutionNoIntersections, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionEmptyA() {
        int[] A = new int[] {};
        Solution instance = new Solution();
        int expResult = 0;
        int result = instance.solution(A);
        System.out.println("testSolutionEmptyA, result = " + result);
        assertEquals(expResult, result);
    }

}
