public class Aritimeticos {
    public static void main(String[] args) {

        double superiorEsquerdo = (Math.pow((6 * ( 2 + 3 )),2) / (3 * 2));
        System.out.println("Superior Esquerdo: " + superiorEsquerdo);

        double superiorDireito = Math.pow((((1 - 5) * (2 - 7)) / 2),2);
        System.out.println("Superior Direito: " + superiorDireito);

        int Completo = (int)(Math.pow((superiorEsquerdo - superiorDireito),3) / Math.pow(10,3));
        System.out.println("Completo: " + Completo);

    }
}
