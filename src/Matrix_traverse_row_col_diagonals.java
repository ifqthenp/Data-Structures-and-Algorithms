/**
 * Let A be a 100 × 100 bi-dimensional array (matrix), the content of all elements is either 0 or 1.
 * Write a program that tests where there are two 1 lying on the same row, the same column, or the same diagonal in A.
 */
public class Matrix_traverse_row_col_diagonals {

    public static void main(String[] args)
    {
        int[][] A = initialiseArray(5, 5); // initialize 2D-array
        System.out.println();

        whichRow(A); // find which row contains two elements = 1
        System.out.println();

        whichColumn(A); // find which columns contains two elements = 1
        System.out.println();

        traverseMinorDiagonal(A); // traverse minor / matrix diagonal
        System.out.println();

        traverseMajorDiagonal(A); // traverse major \ matrix diagonal
    }

    /**
     * This method traverses major '\' matrix diagonal and checks if there are two elements on each diagonal equals to 1.
     * If such diagonal is found, then arrow points at it.
     *
     * @param arr 2D-array
     */
    public static void traverseMajorDiagonal(int[][] arr)
    {
        System.out.println("Major");

        // This loop traverses from bottom left corner to the middle
        for (int k = 0; k < arr.length; k++)
        {
            int count = 0;
            for (int j = 0; j <= k; j++)
            {
                int i = k - j;
                System.out.print(arr[arr.length - i - 1][j] + " ");

                if (arr[arr.length - i - 1][j] == 1)
                {
                    count++;
                }
            }
            if (count == 2)
            {
                System.out.printf("   <<<");
            }
            System.out.println();
        }

        // This loop traverses from the middle - 1 to the top right corner
        for (int k = arr.length - 2; k >= 0; k--)
        {
            int counTwo = 0;
            for (int j = 0; j <= k; j++)
            {
                int i = k - j;
                System.out.print(arr[j][arr.length - i - 1] + " ");

                if (arr[j][arr.length - i - 1] == 1)
                {
                    counTwo++;
                }
            }
            if (counTwo == 2)
            {
                System.out.printf("   <<<");
            }
            System.out.println();
        }
    }

    /**
     * This method traverses minor '/' matrix diagonal and checks if there are two elements on each diagonal equals to 1.
     * If such diagonal is found, then arrow points at it.
     *
     * @param arr 2D-array
     */
    public static void traverseMinorDiagonal(int[][] arr)
    {
        System.out.println("Minor");

        // This loop traverses from top left corner to the middle
        for (int k = 0; k < arr.length; k++)
        {
            int count = 0;
            for (int j = 0; j <= k; j++)
            {
                int i = k - j;
                System.out.print(arr[i][j] + " ");

                if (arr[i][j] == 1)
                {
                    count++;
                }
            }
            if (count == 2)
            {
                System.out.printf("   <<<");
            }
            System.out.println();
        }

        // This loop traverses from the middle - 1 to the bottom right corner
        for (int k = arr.length - 2; k >= 0; k--)
        {
            int countTwo = 0;
            for (int j = 0; j <= k; j++)
            {
                int i = k - j;
                System.out.print(arr[arr.length - i - 1][arr.length - j - 1] + " ");

                if (arr[arr.length - j - 1][arr.length - i - 1] == 1)
                {
                    countTwo++;
                }
            }
            if (countTwo == 2)
            {
                System.out.printf("   <<<");
            }
            System.out.println();
        }
    }

    /**
     * This method takes as input 2D-array and checks if each column in the array has two elements equal to 1.
     * If such column is found, it prints the number of the column.
     * The method swaps i and j, so that columns become rows and rows become columns.
     *
     * @param arr 2D-array
     */
    public static void whichColumn(int[][] arr)
    {
        for (int j = 0; j < arr.length; j++)
        {
            int count = 0;
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i][j] == 1)
                {
                    count++;
                }
            }
            if (count == 2)
            {
                System.out.printf("Col %d %n", j);
            }
        }
    }

    /**
     * This method takes two-dimensional array as argument, then passes it to the findOne() method in the if block to
     * find if each row of the 2D-array has two elements with value equals to 1. If such row is found, it prints the row
     * number.
     *
     * @param arr 2D-array, type of int
     */
    public static void whichRow(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (findOne(arr[i]))
            {
                System.out.printf("Row %d %n", i);
            }
        }
    }

    /**
     * The method takes one-dimensional array as input and iterates through it counting the number of elements with
     * value equals to 1
     *
     * @param arr one-dimensional array, type of int
     * @return TRUE if there are only two array elements with value equals to one
     */
    public static boolean findOne(int[] arr)
    {
        int count = 0;
        for (int el : arr)
        {
            if (el == 1)
            {
                count++;
            }
        }
        return count == 2;
    }

    /**
     * This method initialises 2D-array and returns it to the calling method.
     *
     * @param r number of rows
     * @param c number of columns
     * @return 2D-array
     */
    public static int[][] initialiseArray(int r, int c)
    {
        int[][] arr = new int[r][c];
        for (int m = 0; m < r; m++)
        {
            for (int n = 0; n < c; n++)
            {
                arr[m][n] = (int) (Math.random() * 2);
                System.out.print(arr[m][n] + " ");
            }
            System.out.println();
        }
        return arr;
    }
}
