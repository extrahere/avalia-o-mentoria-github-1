import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em celsius: ");
        double c = scanner.nextDouble();

        double f = (c * 9 / 5) + 32;
        double k = c + 273.15;

        System.out.printf("Temperatura em celsius: %.1f °C%n", c);
        System.out.printf("Temperatura em fahrenheit: %.1f °F%n", f);
        System.out.printf("Temperatura em kelvin: %.1f K%n", k);

        scanner.close();
    }
}
