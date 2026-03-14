//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String nome = "Makalister";
        int idade = 25;
        double saldoBancario = 172.55;
        boolean desenvolvedor = false;
        char sexo = 'M';
        long numeroSerie = 1000001478;

        System.out.printf("Formatacao com println: \n \n");

        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("saldo Bancario: " + saldoBancario);
        System.out.println("desenvolvedor: " + desenvolvedor);
        System.out.println("sexo: " + sexo);
        System.out.println("numeroSerie: " + numeroSerie);

        System.out.printf("\n\nFormatacao com printf: \n \n");

        System.out.printf("Nome: %s \n", nome);
        System.out.printf("idade: %d \n" , idade);
        System.out.printf("saldo Bancario: %.2f \n" , saldoBancario);
        System.out.printf("desenvolvedor: %b \n" , desenvolvedor);
        System.out.printf("numeroSerie: %d \n", numeroSerie);


        }
    }
