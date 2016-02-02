/**
 * Sorted array: find two equal elements in linear time.
 * Design a recursive O(n) algorithm that checks whether the given sorted array contains two equal elements.
 */
public class Recursively_find_two_equal_elements {

    public static void main(String[] args)
    {
        int[] A = {-10, 0, 0, 1, 5, 8, 10, 10, 12, 20, 30, 40, 60};
        int i = 0;
        int j = 1;

        int result = findTwoEqualElements(A, i, j);
        System.out.println(result);
    }

    /**
     * This method checks recursively whether sorted array contains equal elements. It counts 1 when a pair of equal
     * elements if found. That is, if array has three equal elements, it will count them as 2, four elements as 3 etc.
     *
     * @param arr sorted array
     * @param i   array index, type of int
     * @param j   array index, type of int
     * @return 1 if two equal elements found
     */
    public static int findTwoEqualElements(int[] arr, int i, int j)
    {
        if (j == arr.length)
        {
            return 0;
        }
        else
        {
            if (arr[i] == arr[j])
            {
                return 1 + findTwoEqualElements(arr, i + 1, j + 1);
            }
            else
            {
                return findTwoEqualElements(arr, i + 1, j + 1);
            }
        }
    }
}
