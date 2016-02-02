import java.util.Arrays;

/**
 * Let A and B be sorted arrays with all elements of A distinct and all elements of B distinct (though elements can
 * occur in both A and B). Design an O(n) algorithm that produces a sorted array containing those elements that occur
 * in both A and B. For instance, if A = [1, 2, 5, 7] and B = [2, 5, 10], C = [2, 5].
 */
public class Intersection_of_sorted_arrays {

    public static void main(String[] args)
    {
        int[] A = {1, 2, 4, 5, 7, 10};
        int[] B = {2, 3, 5, 6, 8, 10};

        int[] intersectionResult = intersection(A, B);
        System.out.println(Arrays.toString(intersectionResult));
    }

    public static int[] intersection(int[] a, int[] b)
    {
        int cLen;

        if (a.length <= b.length)
        {
            cLen = a.length;
        }
        else
        {
            cLen = b.length;
        }

        int[] c = new int[cLen];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length)
        {
            if (a[i] < b[j])
            {
                i++;
            }
            else if (a[i] > b[j])
            {
                j++;
            }
            else
            {
                c[k++] = a[i];
                i++;
                j++;
            }
        }
        return c;
    }
}
