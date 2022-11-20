import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число чтобы узнать число Фибоначчи: ");
        int n = scanner.nextInt();
        long[] mem = new long[n + 1];
        Arrays.fill(mem,-1);
        System.out.println(fibNaive(n, mem));
        System.out.println(fibEffective(n));
    }

    private static long fibNaive(int n , long[] mem){
        if(mem[n] != -1)
            return mem[n];

        if (n <= 1)
            return n;
        long result = fibNaive(n-1, mem) + fibNaive(n-2, mem);
        mem[n] = result;

        return result;
    }
    private static long fibEffective (int n){
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++)
            arr[i] = arr[i - 1] + arr[i - 2];

        return arr[n];
    }
}