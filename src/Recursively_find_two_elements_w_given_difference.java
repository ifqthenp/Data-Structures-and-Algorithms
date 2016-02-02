/**
 * Sorted array: find two elements differing by 20. Design a recursive O(n) algorithm that checks whether the given
 * sorted array contains two elements whose difference is 20.
 */
public class Recursively_find_two_elements_w_given_difference {

    public static void main(String[] args)
    {
//        int[] A = {10, 20, 12, 5, 8, 1, 0, 22, 1, 45, 20, 25};
        int[] A = {0, 1, 5, 8, 10, 12, 20, 30, 40, 60};
        int i = 0;
        int j = 1;
        int diff = 20;

        int result = findDiff(A, i, j, diff);
        System.out.println(result);
    }

    /**
     * The method recursively searches for array elements with given difference and returns the number of cases when
     * given difference occurs in the array.
     *
     * @param arr sorted array
     * @param i   array index, type of int
     * @param j   array index, type of int
     * @param d   given difference
     * @return number of cases when given difference occurs in the array
     */
    public static int findDiff(int[] arr, int i, int j, int d)
    {
        if (j == arr.length)
        {
            return 0;
        }
        else
        {
            if (arr[j] - arr[i] < d)
            {
                return findDiff(arr, i, j + 1, d);
            }
            else if (arr[j] - arr[i] > d)
            {
                return findDiff(arr, i + 1, j, d);
            }
            else
            {
                return 1 + findDiff(arr, i + 1, j + 1, d);
            }
        }
    }
}
