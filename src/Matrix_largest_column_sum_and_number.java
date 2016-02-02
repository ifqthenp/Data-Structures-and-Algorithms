/**
 * Matrices are often used in scientific and business calculations. An (m x n) matrix is a table with m rows and n
 * columns whose elements are numbers. It is convenient to represent a matrix by two-dimensional array A[][], where
 * A[i][j] refers to an element of the i-th row and j-th column. Matrices are easy to explore using two nested loops
 * where the outer loop iterates over row numbers and the inner loop iterates over the column numbers.
 * 1) Print the largest column sum.
 * (Hint: you will need to explore columns in the outer loop and rows in the inner one).
 */
public class Matrix_largest_column_sum_and_number {

    public static void main(String[] args)
    {
        // declare the array a[][]
        int m = 7;
        int n = 5;
        int[][] a = new int[m][n];
        // initialize a[][] with random numbers and print it
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                a[i][j] = (int) (Math.random() * 20);
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

        // Printing the largest sum of elements of a column n and column number
        int largestSum = 0;
        int largestSumColumnNumber = 0;

        for (int i = 0; i < m; i++)
        {
            largestSum = largestSum + a[i][0];
        }

        for (int j = 1; j < n; j++)
        {
            int nextColSum = 0;
            for (int i = 0; i < m; i++)
            {
                nextColSum = nextColSum + a[i][j];
            }
            if (nextColSum > largestSum)
            {
                largestSumColumnNumber = j;
                largestSum = nextColSum;
            }
        }
        System.out.printf("Largest column sum = %d%nColumn number = %d", largestSum, largestSumColumnNumber);
    }
}
