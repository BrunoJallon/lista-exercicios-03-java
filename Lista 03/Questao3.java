import java.util.Arrays;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números da série de Fibonacci deseja exibir? ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Informe um valor maior que zero.");
        } else if (n > 93) {
            // long comporta até o 93º termo (7540113804746346429); depois disso estoura
            System.out.println("Valor muito grande: o máximo é 93.");
        } else {
            long[] fib = new long[n];
            fib[0] = 0;
            if (n > 1) {
                fib[1] = 1;
            }
            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            System.out.println(Arrays.toString(fib));
        }

        sc.close();
    }
}
