/**
 * Assume that n = 10, the array is [1, 2, 3, 4, 5, 6, 7, 9, 10] (number 8 is missing). How many iterations of the outer
 * loop will be needed for the program to learn that 8 is missing? How many iterations of the inner loop will be needed
 * to find out that 6 is in the array?
 */
public class Missing_number_problem

{

    public static void main(String[] args)
    {
        int[] n = {1, 2, 3, 4, 5, 6, 7, 9, 10};

        int missingNumber = (findMissingNumber(n));
        System.out.printf("missing number = %d%n", missingNumber);

        // Calculate iterations of inner loop using Gauss formula n = n * (n + 1) / 2
        int innerLoopCount = (missingNumber * missingNumber + missingNumber) / 2;
        System.out.printf("inner loop count = %d", innerLoopCount);
    }

    public static int findMissingNumber(int[] n)
    {
        for (int i = 1; i <= n.length; i++)
        {
            int flag = 0;

            for (int j = 0; j < n.length - 1; j++)
            {
                if (n[j] == i)
                {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
            {
                return i;
            }
        }
        return 0;
    }
}
