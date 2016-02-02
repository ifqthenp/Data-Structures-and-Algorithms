import java.util.Arrays;

/**
 * Write a program PlusOne(A) that adds 1 to the number stored in the array.
 * For example, (assuming that the array contains only 3 elements) If A[0] = 0, A[1] = 1, A[2] = 1 then,
 * PlusOne modifies the array to A[0] = 1, A[1] = 0, A[2] = 0.
 */
public class Add_binary_number_in_array {

    public static void main(String[] args)
    {
        final int LENGTH = 5;
        int[] n = new int[LENGTH];

        // assign values 0 or 1 randomly and print initial array
        System.out.printf("%-25s", "Initial random array: ");
        for (int i = 0; i < LENGTH; i++)
        {
            n[i] = (int) (Math.random() * 1 + 0.5);
        }
        System.out.println(Arrays.toString(n));

        // Call the method and print the resulting array using Arrays.toString
        System.out.printf("%-25s", "The resulting array: ");
        System.out.println(Arrays.toString(plusOne(n)));

        System.out.printf("%-25s", "Input {1, 1, 1, 1}   =   ");
        System.out.println(Arrays.toString(plusOne(new int[]{1, 1, 1, 1})));
    }

    /**
     * The method adds 1 to the binary number stored in array as separate values. So if the array is [1, 0, 1] the
     * result will be [1, 1, 0]. The method uses binary number addition rules to calculate values. The rules are:
     * 1 + 0 = 1
     * 1 + 1 = 0, carry 1
     * 1 + 1 + 1 = 1, carry 1
     *
     * @param A array, type of int
     * @return array, type of int
     */
    public static int[] plusOne(int[] A)
    {
        int currentSize = A.length - 1;
        int[] result = new int[A.length];

        for (int i = A.length - 1; i >= 0; i--)
        {
            result[i] = A[i];

            if (A[currentSize] == 0)
            {
                result[currentSize] = 1;
            }
            else
            {
                result[currentSize] = 0;
                currentSize--;

                if (i == 0 && A[0] == 1)
                {
                    result = new int[A.length + 1];
                    result[0] = 1;
                }
            }
        }
        return result;
    }
}
