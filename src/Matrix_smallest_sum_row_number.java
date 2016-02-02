/**
 * Matrices are often used in scientific and business calculations. An (m x n) matrix is a table with m rows and n
 * columns whose elements are numbers. It is convenient to represent a matrix by two-dimensional array A[][], where
 * A[i][j] refers to an element of the i-th row and j-th column. Matrices are easy to explore using two nested loops
 * where the outer loop iterates over row numbers and the inner loop iterates over the column numbers.
 * 2) Print the number of the row having the smallest sum.
 */
public class Matrix_smallest_sum_row_number {

    public static void main(String[] args)
    {
        // declare the array a[][]
        int m = 5;
        int n = 5;
        int[][] a = new int[m][n];

        // initialize a[][] with random numbers and print it
        for (int i = 0; i < m; i++)
        {
            System.out.printf("(%d)", i);
            for (int j = 0; j < n; j++)
            {
                a[i][j] = (int) (Math.random() * 20);
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

        // Print total sum of a[m][n]
        int total = 0;

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                total = total + a[i][j];
            }
        }
        System.out.printf("Total = %d%n", total);


        // Printing the smallest sum of elements of a row m.
        int minSum = 0;
        int minRowSumNumber = 0;

        for (int j = 0; j < n; j++)
        {
            minSum = minSum + a[0][j];
        }

        for (int i = 1; i < m; i++)
        {
            int nextRowSum = 0;

            for (int j = 0; j < n; j++)
            {
                nextRowSum = nextRowSum + a[i][j];
            }
            if (nextRowSum < minSum)
            {
                minRowSumNumber = i;
                minSum = nextRowSum;
            }
        }
        System.out.printf("Minimum row sum = %d%nRow number = %d", minSum, minRowSumNumber);
    }
}
