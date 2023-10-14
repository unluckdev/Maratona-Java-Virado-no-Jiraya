package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20,2);
        System.out.println(resultado);
//        System.out.println(calculadora.divideDoisNumeros(15,4));
        System.out.println(calculadora.divideDoisNumeros02(15,4));
        System.out.println("---------------------");
        calculadora.imprimeDivisaoDeDoisNumeros(10,0);
    }
}
