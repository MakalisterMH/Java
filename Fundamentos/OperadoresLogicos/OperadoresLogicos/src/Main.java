//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        boolean condicao1 = true;
        boolean condicao2 = 1==1;

        boolean condicao3 = 3>4;

        System.out.println(condicao1);
        System.out.println(condicao2);
        System.out.println(condicao3);

        System.out.println("E");

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 && condicao3);
        System.out.println(condicao2 && condicao3);
        System.out.println(2==3 && condicao3);

        System.out.println("OU");

        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 || condicao3);
        System.out.println(condicao2 || condicao3);
        System.out.println(2==3 || condicao3);


        System.out.println("OU EXCLUSIVO");

        System.out.println(condicao1 ^ condicao2);
        System.out.println(condicao1 ^ condicao3);
        System.out.println(condicao2 ^ condicao3);
        System.out.println(2==3 ^ condicao3);

        System.out.println("Negacao");

        System.out.println(!(1==1));
        System.out.println(!(1==2));

        /*

        Operador AND

        verdadeiro && verdadeiro = verdadeiro
        verdadeiro && falso = falso
        falso && verdadeiro = falso
        falso && falso = falso

        Operador OR

        verdadeiro || verdadeiro = verdadeiro
        verdadeiro || falso = verdadeiro
        falso || verdadeiro = verdadeiro
        falso || falso = falso

        Operador AND Exclusivo (XOR)

        verdadeiro ^ verdadeiro = falso
        verdadeiro ^ falso = verdadeiro
        falso ^ verdadeiro = verdadeiro
        falso ^ falso = falso

         */


        }
    }
