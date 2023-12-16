import java.util.Scanner;

public class questao1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Valor do empréstimo: ");
            double emprestimo = scanner.nextDouble();

            System.out.print("Taxa de juros (em decimal): ");
            double taxaJuros = scanner.nextDouble();

            System.out.print("Número de meses: ");
            int meses = scanner.nextInt();

            double amortizacao = emprestimo / meses;
            double saldoDevedor = emprestimo;
            double totalPago = 0;
            double totalAmortizado = 0;
            double totalJuros = 0;

            System.out.printf("Amortização mensal: %.2f, Saldo devedor inicial: %.2f\n", amortizacao, saldoDevedor);

            int mes = 1;
            while (saldoDevedor > 0 && mes <= meses) {
                double juros = saldoDevedor * taxaJuros;
                double prestacao = amortizacao + juros;
                saldoDevedor -= amortizacao;

                System.out.printf("Mês %d | Juros: %.2f | Prestação: %.2f | Saldo devedor: %.2f\n", mes, juros, prestacao, saldoDevedor);

                totalPago += prestacao;
                totalAmortizado += amortizacao;
                totalJuros += juros;

                mes++;
            }

            System.out.printf("Total Pago: %.2f, Total Juros: %.2f, Total Amortizado: %.2f\n", totalPago, totalJuros, totalAmortizado);

            scanner.close();
        }
}

