import java.util.Scanner;

public class DesafioVariaveisConstantes1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double AJUSTE = 32;

        final double FATOR = (5.0 / 9.0);

        System.out.println("Digite um valor de Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double resultado = ((fahrenheit - AJUSTE) * (FATOR));

        System.out.printf("\n\n");

        System.out.printf("Resultado: %.2f", resultado);

    }
}
