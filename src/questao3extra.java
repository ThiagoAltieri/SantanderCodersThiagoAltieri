import java.util.Scanner;

public class questao3extra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual diâmetro horizontal do prisma deseja obter: ");
        int n = scanner.nextInt();

        printTop(n);
        printBottom(n - 1);

        scanner.close();
    }

    public static void imprimirCristal(int tamanho, int espacos) {
        for (int i = 0; i < espacos; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < tamanho; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printTop(int n) {
        for (int x = 0; x <= n; x++) {
            imprimirCristal(x, n - x);
        }
    }

    public static void printBottom(int n) {
        for (int x = n; x >= 0; x--) {
            imprimirCristal(x, n - x);
        }
    }
}