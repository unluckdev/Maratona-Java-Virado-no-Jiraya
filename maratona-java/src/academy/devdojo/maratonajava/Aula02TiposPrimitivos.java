package academy.devdojo.maratonajava;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, chat, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 100000000L;
        double salarioDouble = 2000D;
        float salarioFloat = 2500F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractereAscii = 65; // Tabela ASCII
        char caractereUni = '\u00a7'; // Tabela UNICODE


        System.out.println("A idade é "+idade);
        System.out.println(caractereAscii);
        System.out.println(caractereUni);
    }
}
