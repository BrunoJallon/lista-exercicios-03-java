import java.util.Arrays;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];
        int qtd = 0; // quantos números já foram guardados

        while (qtd < 6) {
            System.out.print("Digite o " + (qtd + 1) + "º número (1 a 60): ");
            int numero = sc.nextInt();

            if (numero < 1 || numero > 60) {
                System.out.println("Número fora do intervalo! Use valores de 1 a 60.");
            } else {
                // Verifica se o número já foi digitado (olha só as posições já preenchidas)
                boolean repetido = false;
                for (int i = 0; i < qtd; i++) {
                    if (numeros[i] == numero) {
                        repetido = true;
                    }
                }

                if (repetido) {
                    System.out.println("Número repetido! Digite outro.");
                } else {
                    numeros[qtd] = numero;
                    qtd++;
                }
            }
        }

        Arrays.sort(numeros); // ordem crescente
        System.out.println("Números em ordem crescente: " + Arrays.toString(numeros));
        sc.close();
    }
}
