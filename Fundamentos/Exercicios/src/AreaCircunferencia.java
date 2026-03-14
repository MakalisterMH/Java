//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AreaCircunferencia {

    public static void main(String[] args) {

        double raio = 3.4;
        final double PI = 3.14159;

        double resultado = PI * raio * raio;
        int resultado2 =  (int)(PI * raio * raio); // cast de double para int

        System.out.println(resultado);
        System.out.println(resultado2);
    }
}