package academy.devdojo.maratonajava.javacore.Gassosiacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Entre com sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Entre com seu sexo M ou F: ");
        char sexo = entrada.next().charAt(0); // Pega a primeira letra da palavra e transforma em char
        System.out.println("-------------------");
        System.out.println("Nome " + nome);
        System.out.println("Idade " + idade);
        System.out.println("Sexo " + sexo);
    }
}
