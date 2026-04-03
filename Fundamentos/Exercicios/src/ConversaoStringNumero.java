import javax.swing.*;
import java.math.BigDecimal;

public class ConversaoStringNumero {
    public static void main(String[] args) {


        String texto1 = JOptionPane.showInputDialog("Digite o primeiro numero");

        String texto2 = JOptionPane.showInputDialog("Digite o segundo numero");

        double numero1 = Double.parseDouble(texto1);

        double numero2 = Double.parseDouble(texto2);

        double soma = numero1 + numero2;

        System.out.printf("Soma: %.2f. ", soma);

        BigDecimal resultado = BigDecimal.valueOf(soma);

        System.out.println(resultado);

    }
}
