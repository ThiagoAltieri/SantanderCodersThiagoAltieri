import java.util.Scanner;
public class qestao2v2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Qual temperatura gostaria de converter: ");
            double temperatura = scanner.nextDouble();
            System.out.print("Qual unidade de origem (C, K, F): ");
            char unidadeOrigem = scanner.next().charAt(0);

            double temperaturaCelsius = converterParaCelsius(temperatura, unidadeOrigem);

            System.out.print("Para qual unidade de destino (C, K, F): ");
            char unidadeDestino = scanner.next().charAt(0);

            double temperaturaConvertida = converterDeCelsius(temperaturaCelsius, unidadeDestino);

            exibirResultado(temperatura, unidadeOrigem, temperaturaConvertida, unidadeDestino);

            scanner.close();
        }
        public static double converterParaCelsius(double temperatura, char unidadeOrigem) {
            if (unidadeOrigem == 'K') {
                return temperatura - 273.15;
            } else if (unidadeOrigem == 'F') {
                return (temperatura - 32) * 5 / 9;
            } else {
                return temperatura;
            }
        }
        public static double converterDeCelsius(double temperaturaCelsius, char unidadeDestino) {
            if (unidadeDestino == 'K') {
                return temperaturaCelsius + 273.15;
            } else if (unidadeDestino == 'F') {
                return (temperaturaCelsius * 9 / 5) + 32;
            } else {
                return temperaturaCelsius;
            }
        }
        public static void exibirResultado(double temperaturaOriginal, char unidadeOrigem, double temperaturaConvertida, char unidadeDestino) {
            System.out.printf("Temperatura Inicial: %.2f %s\n", temperaturaOriginal, unidadeOrigem);
            System.out.printf("Temperatura após conversão: %.2f %s\n", temperaturaConvertida, unidadeDestino);
        }
}

