package academy.devdojo.maratonajava;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while (count < 10) {
            // count++;
            // count += 2;
            System.out.println("Número: " + (++count));
        }
        count = 2;
        do {
            System.out.println("Sempre imprime o DO, antes do while");
        } while (count > 10);


        for (int i = 0; i < 10; i++) {
            System.out.println("For indice: " + i);
        }


    }
}
