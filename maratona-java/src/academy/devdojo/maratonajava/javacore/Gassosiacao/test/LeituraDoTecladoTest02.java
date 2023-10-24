package academy.devdojo.maratonajava.javacore.Gassosiacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro!");
        System.out.println("Digite sua perfunta e eu responderei com Sim ou Não.");
        String pergunta = scanner.next();
        if(pergunta.charAt(0)==' '){
            System.out.println("SIM");
        }else{
            System.out.println("NÃO");
        }
    }
}
