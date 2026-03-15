import java.util.Scanner;

public class ConsoleScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Nome: " + nome);

        System.out.println("Digite seu sobre nome: ");
        String sobreNome = sc.nextLine();
        System.out.println("Sobre Nome: " + sobreNome);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Idade: " + idade);

        System.out.printf("Nome: %s %s e idade: %d", nome, sobreNome, idade);

        sc.close();

    }
}
