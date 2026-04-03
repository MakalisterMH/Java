public class ConversaoTipoPrimitivo {

    public static void main(String[] args) {

        double numero1 = 1; // Implicita

        System.out.println(numero1);

        int numero2 = (int) 3.3;  // Explicita

        System.out.println(numero2);

        /* Obs: se atentar ao tamanho dos tipos, os menores cabem dentro dos maiores ...
         os maiores podem ser convertido para o menor ... porem você assume o risto de perder informação. */
        
    }
}

