import java.util.Scanner;

public class questao3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para base do triângulo: ");
        int n = scanner.nextInt();

        desenharTriangulo(n);

        scanner.close();
    }
    public static void desenharTriangulo(int tamanho) {
        int linha = 0;
        while (linha < tamanho) {
            int espacos = 0;
            while (espacos < tamanho - linha - 1) {
                System.out.print(" ");
                espacos++;
            }

            int asteriscos = 0;
            while (asteriscos < 2 * linha + 1) {
                System.out.print("*");
                asteriscos++;
            }

            System.out.println();

            linha++;
        }
    }
}