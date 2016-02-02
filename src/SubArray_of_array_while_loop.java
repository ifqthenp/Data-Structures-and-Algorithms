/**
 * Subarray of an array. An array B of m elements is a subarray of an array A on n > m elements if
 * [B[0], ... , B[m - 1]] equals [A[i], ... , A[i + m - 1]] for some 0 <= i < j <= n - 1. For example, an array B =
 * [2, 3, 5] is subarray of an array A = [8, 10, 2, 3, 5, 16, 4]. Indeed, [A[2], A[3], A[4]] is exactly B.
 * Write an algorithm that takes as input two arrays A and B and checks whether B is subarray of A.
 */
public class SubArray_of_array_while_loop {

    public static void main(String[] args)
    {
        int[] A = {8, 10, 2, 3, 5, 16, 4};
        int[] B = {16, 4, 5};

        System.out.println(subArray(A, B));
    }

    /**
     * The method is a for loop implementation of brute-force substring search algorithm.
     *
     * @param A array
     * @param B subarray
     * @return TRUE if B is subarray of A and FALSE otherwise
     */
    public static boolean subArray(int[] A, int[] B)
    {
        int n = A.length;
        int m = B.length;

        for (int i = 0; i <= n - m; i++)
        {
            int j;
            for (j = 0; j < m; j++)
            {
                if (A[i + j] != B[j])
                {
                    break;
                }
            }
            if (j == m)
            {
                return true;
            }
        }
        return false;
    }
}
