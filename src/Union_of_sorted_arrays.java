import java.util.Arrays;

/**
 * Let A and B be sorted arrays with all elements of A distinct and all elements of B distinct (though elements can
 * occur in both A and B). Design an O(n) algorithm that produces a sorted array C containing all elements of A and B
 * without repetitions. For instance, if A = [1, 2, 5, 7] and B = [2, 5, 10], C = [1, 2, 5, 7, 10].
 */
public class Union_of_sorted_arrays {

    public static void main(String[] args)
    {
        int[] A = {1, 2, 5, 7};
        int[] B = {2, 5, 10};

        int[] mergeResult = merge(A, B);
        System.out.println(Arrays.toString(mergeResult));
    }

    /**
     * This method takes two 1D-arrays as arguments and merges them into the new array
     *
     * @param A array to merge
     * @param B array to merge
     * @return array, type of int
     */
    public static int[] merge(int[] A, int[] B)
    {
        int[] C = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;

        while (i < A.length && j < B.length)
        {

            if (A[i] < B[j])
            {
                C[k] = A[i];
                i++;
            }
            else if (A[i] > B[j])
            {
                C[k] = B[j];
                j++;
            }
            else
            {
                C[k] = A[i];
                i++;
                j++;
            }
            k++;
        }

        if (i < A.length)
        {
            for (int p = i; p < A.length; p++)
            {
                C[k] = A[p];
                k++;
            }
        }
        else
        {
            for (int p = j; p < B.length; p++)
            {
                C[k] = B[p];
                k++;
            }
        }
        return C;
    }
}
