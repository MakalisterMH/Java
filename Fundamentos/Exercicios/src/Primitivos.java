public class Primitivos {
    public static void main(String[] args) {

        // Tipos numericos inteiros
        byte idade = 127;
        short metros = 9999;
        int id = 99999999;
        long pedido = 999999999;

        // Tipos numericos de ponto flutuante
        float altura = 1.85f;
        double salario = 3.500;

        // Tipo Booleano (Verdadeiro ou Falso)
        boolean ativo = true;

        // Tipo caractere (Exemplo M para Marcuslino e F para feminino)
        char sexo = 'M';

        System.out.printf("idade: %d, metros: %d, id: %d, pedido: %d, altura: %.2f, salario: %.2f, ativo: %b e sexo: %c."
        ,idade,metros,id,pedido,altura,salario,ativo,sexo);

    }
}
