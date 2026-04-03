import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o seu nome: ");

        String nome = sc.nextLine();


        System.out.println("Digite seu primeiro salario");

        String salario1 = sc.nextLine().replace(",",".");


        System.out.println("Digite seu segundo salario");

        String salario2 = sc.nextLine().replace(",",".");

        System.out.println("Digite seu terceiro salario");

        String salario3 = sc.nextLine().replace(",",".");

        double numero1 = Double.parseDouble(salario1);
        double numero2 = Double.parseDouble(salario2);
        double numero3 = Double.parseDouble(salario3);

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.printf("Media dos ultimos 3 meses: %.2f ", media);

    }
}
