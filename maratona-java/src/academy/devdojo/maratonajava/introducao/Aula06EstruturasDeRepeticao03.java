package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    // imprima os primeiros 25 números de um dado valor
    public static void main(String[] args) {
        int valorMaximo = 50;
        for (int i = 0; i <= 50 ; i++) {
            if (i>25){
                break;
            }
            System.out.println("Contando os 25 primeiros: " + i);
        }
    }
}
