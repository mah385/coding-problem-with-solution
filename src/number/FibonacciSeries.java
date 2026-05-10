package number;

//Question: WAP to generate Fibonacci series based on the given count number
public class FibonacciSeries {

    //Output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
    static void main(String[] args) {
        int count = 10;
        System.out.print("Fibonacci: ");
        for (int i = 0; i < count; i++) {
            System.out.print(generateFibonacciSeries(i) + " ");
        }
    }

    private static int generateFibonacciSeries(int n) {
        if (n <= 1) {
            return n;
        }
        // Recursive case: Fn = Fn-1 + Fn-2
        return generateFibonacciSeries(n - 1) + generateFibonacciSeries(n - 2);
    }

}
