/**
 * Design O(n) algorithm that checks whether all elements of given array are equal.
 */
public class Check_if_all_elements_are_equal {

    public static void main(String[] args)
    {
        int[] A = {1, 1, 1, 1, 1, 1, 1, 1};
        int[] B = {1, 3, 134, 1, 4, 5, 345, 63};

        System.out.println(allEqual(A));
        System.out.println(allEqual(B));
    }

    public static boolean allEqual(int[] arr)
    {
        for (int el : arr)
        {
            if (arr[0] != arr[el])
            {
                return false;
            }
        }
        return true;
    }
}
