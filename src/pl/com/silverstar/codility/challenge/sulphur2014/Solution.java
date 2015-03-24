package pl.com.silverstar.codility.challenge.sulphur2014;

/**
 *
 * @author sylwester.stocki
 */
public class Solution {

    /**
     *
     * Codility result = 87%, Detected time complexity: O(N**2) - expected worst-case time complexity is O(N*log(N)).
     *
     * @param A
     * @return
     */
    public int solution(int[] A, int[] B, int[] C) {
        // write your code in Java SE 8

        int i = 0;
        for (; i < A.length; i++) {
            int durability = A[i];
            int weight = B[i];
            int position = C[i];

            //System.out.println("[d,w,p]=[" + durability + "," + weight + "," + position + "]");
            if ((weight > durability) || !addWeight(A, B, C, position, weight)) {
                break;
            }
            //System.out.println("i = " + i);
        }
        return i;
    }

    public boolean addWeight(int[] A, int[] B, int[] C, int position, int weight) {
        if (position >= 0) {
            B[position] += weight;
            if (B[position] > A[position]) {
                return false;
            } else {
                return addWeight(A, B, C, C[position], weight);
            }
        }
        return true;
    }
}
