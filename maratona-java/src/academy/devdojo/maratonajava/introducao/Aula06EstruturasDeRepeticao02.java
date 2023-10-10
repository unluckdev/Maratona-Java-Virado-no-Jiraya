package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 a 1000000
        int numero = 10000;
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
