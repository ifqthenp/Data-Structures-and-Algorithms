/**
 * Compute n-th Fibonacci number
 */
public class Fibonacci_algorithm {

    public static void main(String[] args)
    {
        int nth_number = 5;

        System.out.print(fibonacci(nth_number));
    }

    public static int fibonacci(int n)
    {
        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++)
        {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}
