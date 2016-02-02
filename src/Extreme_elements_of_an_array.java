/**
 * Let A be an array of n elements (that is, the elements of A are A[0], ... , A[n - 1]). An element A[i] is extreme
 * if the the following conditions hold regarding A[i]:
 * -    A[i] is not the first nor the last element of A. That is, 0 < i < n - 1.
 * -    Either A[i - 1] < A[i] > A[i + 1] or A[i - 1] > A[i] < A[i + 1].
 * For example, the extreme points of an array [0, 5, 3, 6, 8, 7, 15, 9] are 5, 3, 8, 7, 15.
 * Solve the following problems:
 * 1. Write pseudocode of an algorithm that prints the extreme points of an array. If there are no extreme points,
 * the algorithm prints "SORTED".
 * 2. Is it always true that if an array has two or more extreme points, they alternate, like min-max-min-max-... or
 * max-min-max-min-... If you believe this is true, provide a short justification of your position. Otherwise,
 * provide an example of an array where the above pattern does not hold.
 */
public class Extreme_elements_of_an_array {

    public static void main(String[] args)
    {
        int[] A = {0, 5, 3, 6, 8, 7, 15, 9};
        int extremesCount = A.length - 2;

        for (int i = 1; i < A.length - 1; i++)
        {
            if (((A[i] > A[i - 1] && A[i] > A[i + 1]) || (A[i] < A[i - 1] && A[i] < A[i + 1])) && extremesCount > 0)
            {
                System.out.print(A[i] + " ");
            }
            else
            {
                extremesCount--;
            }
        }

        if (extremesCount == 0)
        {
            System.out.print("SORTED");
        }
    }
}
