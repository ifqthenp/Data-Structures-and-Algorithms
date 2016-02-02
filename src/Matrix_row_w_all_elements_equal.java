/**
 * Matrices are often used in scientific and business calculations. An (m x n) matrix is a table with m rows and n
 * columns whose elements are numbers. It is convenient to represent a matrix by two-dimensional array A[][], where
 * A[i][j] refers to an element of the i-th row and j-th column. Matrices are easy to explore using two nested loops
 * where the outer loop iterates over row numbers and the inner loop iterates over the column numbers.
 * 3) Write a program that prints "YES" if A contains a row with all elements equal 1 and "NO" otherwise.
 */
public class Matrix_row_w_all_elements_equal {

    public static void main(String[] args)
    {
        // Initialise and print array
        final int m = 5;
        final int n = 5;
        int[][] A = new int[m][n];

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                A[i][j] = (int) (Math.random() * 2);
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        // Print the result
        System.out.println(equalElementsOfRow(A));
    }

    /**
     * This method takes two-dimensional array as argument, then passes it to the row() method in the 'if' block to
     * find if each row of the 2D-array has all elements equals to 1. If such row is found, it prints "YES".
     *
     * @param arr 2D-array, type of int
     * @return String "YES" or "NO"
     */
    public static String equalElementsOfRow(int[][] arr)
    {
        String result = "NO";

        for (int i = 0; i < arr.length; i++)
        {
            if (row(arr[i]))
            {
                result = "YES";
            }
        }
        return result;
    }

    /**
     * The method takes one-dimensional array as argument and iterates through it counting the number of elements with
     * value equals to 1
     *
     * @param arr one-dimensional array, type of int
     * @return TRUE if all elements of row equal to 1
     */
    public static boolean row(int[] arr)
    {
        int count = 0;
        for (int el : arr)
        {
            if (el == 1)
            {
                count++;
            }
        }
        return count == arr.length;
    }
}
