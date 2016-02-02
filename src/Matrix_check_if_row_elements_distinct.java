/**
 * Matrices are often used in scientific and business calculations. An (m x n) matrix is a table with m rows and n
 * columns whose elements are numbers. It is convenient to represent a matrix by two-dimensional array A[][], where
 * A[i][j] refers to an element of the i-th row and j-th column. Matrices are easy to explore using two nested loops
 * where the outer loop iterates over row numbers and the inner loop iterates over the column numbers.
 * 4) Write a program that prints "YES" if in each row of A, all the elements are distinct and "NO" otherwise. (Hint:
 * First write a function that takes as input a one-dimensional array and checks if all elements in this array are
 * distinct. Then, apply this function to each row of a matrix (treating this row as a one dimensional array). Print
 * "YES" if and only if the function returns TRUE for each row.
 */
public class Matrix_check_if_row_elements_distinct {

    public static void main(String[] args)
    {
        // declare the array a[][]
        int m = 5;
        int n = 5;
        int[][] a = new int[m][n];

        // initialize a[][] with random numbers and print it
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                a[i][j] = (int) (Math.random() * 30);
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

        // number of rows that will be decremented if some elements of the row are not distinct
        int yes = m;
        // result will be assigned depending on the value of yes variable, if yes < m, then result is "NO"
        String result = "";

        // This loop iterates through a[][] rows
        for (int i = 0; i < m; i++)
        {
            // if checkArray() method returns true and yes == m (number of rows in the array a[][]),
            // then result is "YES" and will be printed just once if true for all the rows in the array
            if (checkArray(a[i]) && yes == m)
            {
                result = "YES";
            }
            else
            {
                yes--;
                result = "NO";
            }
        }
        System.out.println(result);
    }

    /**
     * This function takes as input one-dimensional array and checks if all elements of it are distinct. If they are
     * distinct it will return TRUE
     *
     * @param arr array of int type
     * @return TRUE or FALSE
     */
    public static boolean checkArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr[j] == arr[i])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
