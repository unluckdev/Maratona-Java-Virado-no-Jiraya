package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela =>1000

    public static void main(String[] args) {
        double valorTotal = 30000;

        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000){
                continue; // O que está acontecendo aqui, em quanto o valor da parcela não for menor que viu ele não va
                          // executar o sout da parcela
            }
            System.out.println("Parcela " + parcela+ " R$ "+valorParcela);

        }
    }
}
