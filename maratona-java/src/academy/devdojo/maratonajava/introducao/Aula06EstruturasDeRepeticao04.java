package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela =>1000

    public static void main(String[] args) {
        int valorCarro = 30000;
        int valorMinimoParcela = 1000;
        for (int i = 1; i <= valorCarro; i++) {
            double parcela = valorCarro / i;

            if (valorCarro / i < valorMinimoParcela) {
                break;
            }
            System.out.println("Números de parcelas: " + i + " de R$ " + parcela);

        }
    }
}
