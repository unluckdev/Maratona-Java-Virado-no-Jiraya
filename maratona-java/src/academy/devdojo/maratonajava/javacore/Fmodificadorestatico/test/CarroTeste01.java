package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro("Audi", 290);


// this. faz referencia ao objeto/variavel
// Carro. faz referencia a class
        Carro.velocidadeLimite = 180;

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
