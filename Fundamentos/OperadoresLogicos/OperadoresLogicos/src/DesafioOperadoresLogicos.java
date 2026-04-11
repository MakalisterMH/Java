import java.util.Scanner;

public class DesafioOperadoresLogicos {
    public static void main(String[] args) {

        /*
        Se os 2 trabalhos derem certo todo mundo vai para o shopping comprar uma tv de 50 polegadas no fim de semana.
        Se apenas 1 dos 2 trabalhos derem certo, comprar televisao de 32 polegadas.
        E se comprou algumas das 2, a familia vai tomar sorvete
         */

        Scanner sc = new Scanner(System.in);

        boolean trabalho1, trabalho2;

        System.out.println("Você passou no primeiro trabalho ? S para verdadeiro ou N para falso");

        String usuario = sc.next();

        if (usuario.equalsIgnoreCase("S")) {
            trabalho1 = true;
        } else {
            trabalho1 = false;
        }

        System.out.println("Você passou no segundo trabalho ? S para verdadeiro ou N para falso");

        usuario = sc.next();

        if (usuario.equalsIgnoreCase("S")) {
            trabalho2 = true;
        } else {
            trabalho2 = false;
        }

        // ----------------------------------------------------------------------------------------

        if (trabalho1 && trabalho2) {
            System.out.println("A familia vai no shopping comprar uma TV de 50 Polegadas");
        }

        if (trabalho1 ^ trabalho2) {
            System.out.println("Comprar TV de 32 polegadas");
        }

        if (trabalho1 || trabalho2) {
            System.out.println("Todo mundo vai tomar sorvete");
        }

        if (!trabalho1 && !trabalho2) {
            System.out.println("Todo mundo vai ficar em casa :(");
        }

    }
}
