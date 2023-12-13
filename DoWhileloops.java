// Activity 1 (Introduction): My First Input

// Create a new Java class with a main method(so you can run your code) called Fibonacci

// The Fibonacci numbers are a traditional computer science problem: "each number is the sum of the two preceding ones, starting from 0 and 1."

// The beginning of the sequence is thus:

// 0 1 1 2 3 5 8 13 21 34 55 89 ...

// Add the following import to be able to capture user input n

    // Implement a Do While loop that calculates Fibonacci(n)

    // n	Fibonacci(n)
    // 0	0
    // 1	1
    // 2	1
    // 3	2
    // 4	3
    // 5	5
    // 6	8
    // 7	13
    // ...	...
import java.util.Scanner;

public class DoWhileloops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a  calculate Fibonacci: ");
        int n = scanner.nextInt();

        int fibonacciN = calculateFibonacci(n);

        System.out.printf("Fibonacci(%d) = %d\n", n, fibonacciN);

        scanner.close();
    }

    private static int calculateFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0, b = 1, result = 0, count = 2;

            do {
                result = a + b;
                a = b;
                b = result;
                count++;
            } while (count <= n);

            return result;
        }
    }
}