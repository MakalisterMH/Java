public class Wrappers {
    public static void main(String[] args) {

        // Wrappers é os tipos primitivos em versão objetos.

        // A diferença para o tipos primitivos é a letra inicial maiuscula.

        Byte idade = 26;
        Short anoNascimento = 1999;
        Integer salario = 12500;
        Long cpf = 70383214158L;

        System.out.println(idade.byteValue());

        System.out.println(anoNascimento.intValue());

        System.out.println(salario.intValue());

        System.out.println(cpf.longValue());

        // ------------------------------------------

        Float metros = 3.45F;
        Double altura = 1.85;

        System.out.println(metros.floatValue());
        System.out.println(altura.doubleValue());

        // ------------------------------------------

        Boolean ativo = false;
        Character sexo = 'M';

        System.out.println(ativo);
        System.out.println(sexo);

        System.out.println(ativo.toString().toUpperCase());
        System.out.println(sexo.toString().toLowerCase());

    }
}
