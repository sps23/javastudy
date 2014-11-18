package pl.com.silverstar.codility.challenge.gamma2011;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author sylwester.stocki
 */
public class SolutionTest {

    public SolutionTest() {
    }

    @Test
    public void testSolutionExample1() {
        String S = "baababa";
        Solution instance = new Solution();
        int expResult = 6;
        int result = instance.solution(S);
        System.out.println("testSolutionExample1, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionExample2() {
        String S = "abbacada";
        Solution instance = new Solution();
        int expResult = 4;
        int result = instance.solution(S);
        System.out.println("testSolutionExample2, result = " + result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionPerf1() {
        final int max = 5000;
        StringBuilder sb = new StringBuilder(2 * max);
        for (int i = 0; i < max; i++) {
            sb.append("a");
        }
        for (int i = 0; i < max; i++) {
            sb.append("b");
        }
        Solution instance = new Solution();
        int expResult = 24995000;
        int result = instance.solution(sb.toString());
        System.out.println("testSolutionPerf1, result = " + result);
        assertEquals(expResult, result);
    }
}
