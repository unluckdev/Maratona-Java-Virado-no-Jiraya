package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
        calculadora.somaArray(numeros);

        calculadora.somaVarArgs(numeros);
        calculadora.somaVarArgs(1, 2, 3, 4, 5);
    }
}
