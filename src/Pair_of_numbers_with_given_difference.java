import java.util.Arrays;

/**
 * Check whether the array contains two elements with any given difference. Do it with O(n) algorithm complexity.
 */
public class Pair_of_numbers_with_given_difference {

    public static void main(String[] args)
    {
        // Initialize the array with random numbers
        int[] a = new int[30];

        for (int i = 0; i < a.length; i++)
        {
            a[i] = (int) (Math.random() * 20);
        }

        // Sort the array using insertion sort
        for (int i = 1; i < a.length; i++)
        {
            int temp = a[i];
            int j;
            for (j = i - 1; j >= 0 && temp < a[j]; j--)
            {
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
        }

        // Remove duplicates from the array
        int m = 0;
        int n = 1;
        while (n < a.length)
        {
            if (a[n] == a[m])
            {
                n++;
            }
            else
            {
                m++;
                a[m] = a[n];
                n++;
            }
        }

        // Copy the result to a new array
        int[] b = Arrays.copyOf(a, m + 1);

        // Print the array
        for (int el : b)
        {
            System.out.print(el + " ");
        }
        System.out.println();

        // Find a pair of numbers with given difference
        int x = 0;
        int y = 1;
        int diff = 10;
        int count = 0;

        while (y < b.length)
        {
            if (b[y] - b[x] < diff)
            {
                y++;
            }
            else if (b[y] - b[x] > diff)
            {
                x++;
            }
            else
            {
                count++;
                y++;
            }
        }
        System.out.printf("Number of pairs with difference %d is %d", diff, count);
    }
}
