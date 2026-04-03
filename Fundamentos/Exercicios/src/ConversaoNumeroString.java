public class ConversaoNumeroString {
    public static void main(String[] args) {

        Integer idade = 26;

        System.out.println(idade.toString()); // conversao utilizando o Wrapper Integer

        int ano = 1999;

        System.out.println(Integer.toString(ano).length()); // conversao chamando o Wrapper

    }
}
