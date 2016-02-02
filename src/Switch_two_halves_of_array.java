import java.util.Arrays;

/**
 * You are given an array whose size is an even number, switch the first and the second half.
 */
public class Switch_two_halves_of_array {

    public static void main(String[] args)
    {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(switchHalves(A)));
    }

    public static int[] switchHalves(int[] arr)
    {
        int i = 0;
        int j = arr.length / 2;
        int temp;

        while (i < arr.length / 2)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j++;
        }
        return arr;
    }
}
