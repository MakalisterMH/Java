public class TipoString {
    public static void main(String[] args) {


        System.out.println("Makalister Honorato".charAt(2));

        String frase = "Boa Tarde";
        frase = frase.concat(" !!!");
        System.out.println(frase);

        System.out.println(frase.startsWith("Boa")); // inicia com "Boa" ?

        System.out.println("Makalister".length());

        System.out.println("Honorato".endsWith("to")); // termina com "to" ?

        String nome = "Makalister";
        System.out.println("makalister".equals(nome)); // Comparar String
        System.out.println("makalister".equalsIgnoreCase(nome)); // Comparar String ignorando o case sensitive

        System.out.println("Makalister".contains("ka")); // dentro da String contem "ka" ?

        System.out.println("Makalister".indexOf("ka")); // indice "ka" na String

        System.out.println("Makalister".substring(4)); // pegar String e começar da posição 4
        System.out.println("Makalister".substring(4,7)); // pegar String e começar da posição 4 e finalizar na 7

        var sobreNome = "Honorato";

        System.out.println(sobreNome.replace("Honorato", "Marques"));


        String nomeCompleto = "Makalister Marques Honorato";
        int idade = 26;
        String fraseStringFormat = String.format("O seu nome é: %s e você possui %d anos.",nomeCompleto,idade);
        System.out.println(fraseStringFormat);

    }
}
