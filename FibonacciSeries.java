 import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();
        
        System.out.println("Fibonacci Series up to " + n + " terms:");
        printFibonacciSeries(n);
    }
    public static void printFibonacciSeries(int n) {
        int t1 = 0;
        int t2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
    
}
