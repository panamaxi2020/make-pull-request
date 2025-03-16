import java.util.Scanner;

public class MaxComunDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        
        int valorMinimo = Math.min(a, b);
        
        long factorial = factorial(minVal);
        
        System.out.println(factorial);
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
