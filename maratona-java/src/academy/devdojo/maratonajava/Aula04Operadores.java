package academy.devdojo.maratonajava;

/**
 * Operador + ele é sobrecarregado,
 * pode tanto concatenar, como somar
 * para concatenar basta colocar uma string antes da operação com +
 * e para voltar a sumar junto com uma concatenação basta
 * utilizar dentro de parentes
 * <p>
 * OBS O RESULTA DE UMA OPERAÇÃO ENTRE DOIS INTEIROS SEMPRE É INTEIRO
 * int 10 / int 20 = 0
 */
public class Aula04Operadores {
    public static void main(String[] args) {
        // +  -  /  *
        int numero01 = 10;
        //int numero02 = 20;
        double numero02 = 20;
        double resultado = numero01 / numero02;

        //System.out.println("Concatenando " + numero01 + numero02 + " agora Somando agora " + (numero02 + numero01));
        System.out.println(resultado);

        // % resto de devisão
        int resto = 21 % 2;
        System.out.println(resto);

        // < menor
        // >maior
        // <= menor igual
        // >= maior igua
        // == igual
        // != diferente
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte " + isDezIgualQueVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);


        // OPERADOR LÓGICO
        // && (AND e)
        // || (OR ou)
        // ! (NOT não)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPS5 = 5000F;
        boolean isPS5Compravel = valorTotalContaCorrente > valorPS5 || valorTotalContaPoupanca > valorPS5;
        System.out.println("isPS5Compravel " + isPS5Compravel);

        //ATRIBUIÇÃO
        // = += -= *= /= %=
        double bonus = 1800;

    }
}
