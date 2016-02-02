import java.util.Arrays;

/**
 * Consider the task of rearranging all elements in an array so that the even numbers come first.
 * Other­wise, the order does not matter. For example, the array
 * *    1 4 14 2 1 3 5 6 23
 * could be rearranged to
 * *    4 2 14 6 1 5 3 23 1
 */
public class Swap_even_odd_elements {

    public static void main(String[] args)
    {
        int[] A = {1, 4, 14, 2, 1, 3, 5, 6, 23};
        System.out.println(Arrays.toString(A));

        int[] result = swapEvenFirst(A);
        System.out.println(Arrays.toString(result));
    }

    /**
     * Method swaps even and odd numbers of the array. Even numbers come first and odd numbers come after
     *
     * @param arr an array, type of int
     * @return array with even numbers come first
     */
    public static int[] swapEvenFirst(int[] arr)
    {
        int i = 0;
        int j = arr.length - 1;
        int temp;

        while (i < j)
        {
            if (arr[i] % 2 == 0)
            {
                i++;
            }
            else if (arr[j] % 2 != 0)
            {
                j--;
            }
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
