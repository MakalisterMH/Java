public class NotacaoPonto {
    public static void main(String[] args) {

        String nome = "Makalister Honorato";
        System.out.println("Original: " + nome);

        nome = nome.toUpperCase();
        System.out.println("UpperCase: " + nome);

        nome = nome.toLowerCase();
        System.out.println("LowerCase: " + nome);

        nome = nome.replace("honorato","marques");
        System.out.println("Replace no sobre nome: " + nome);

        nome = nome.concat(" honorato");
        System.out.println("Concat no nome: " + nome);

        System.out.println("MaKaLiStEr".toUpperCase()); // Possibilidade de usar Notacao Ponto direto na impressao.

        String sobreNomeLower = "HoNoRaTo".toLowerCase(); // Possibilidade de usar Notacao Ponto direto na declaracao.
        System.out.println(sobreNomeLower);

        String nomeReplaceUpper = "Makalister".replace("k","c").toUpperCase();
        System.out.println(nomeReplaceUpper); // Possibilidade de usar Notacao Ponto dentro de outra.

        // Anotacao ponto não se usa com tipos primitivos: int, double, char ...

    }
}
