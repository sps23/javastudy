package pl.com.silverstar.codility.challenge.gamma2011;

/**
 *
 * @author sylwester.stocki
 */
public class Solution {

//    public int solution(String S) {
//
//        int result = 0;
//        char[] chars = S.toCharArray();
//        int N = chars.length;
//        for (int i = 0; i < N - 1; i++) {
//            for (int j = i + 1; j < N; j++) {
//                if (isPalindrome(chars, i, j)) {
//                    result++;
//                }
//            }
//        }
//        if (result > 100000000) {
//            result = -1;
//        }
//        return result;
//    }
    /**
     *
     * codility 100% correct, 11% performance
     *
     * @param S
     * @return
     */
    public int solution(String S) {
        int result = 0;
        char[] chars = S.toCharArray();
        int N = chars.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = N - 1; j > i; j--) {
                if (isPalindrome(chars, i, j)) {
                    result++;
                }
            }
        }
        if (result > 100000000) {
            result = -1;
        }
        return result;
    }

    private boolean isPalindrome(char[] chars, int start, int end) {
        int N = end - start + 1;
        boolean result = true;

        for (int i = 0; i < (N / 2); i++) {
            if (chars[start + i] != chars[start + N - 1 - i]) {
                result = false;
                break;
            }
        }

        //String s = new String(chars, start, N);
        //System.out.println("S = " + s + ";\t[" + start + ";" + end + "]\t[" + result + "].");
        return result;
    }
}
