package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro("Audi", 290);


// this. faz referencia ao objeto/variavel
// Carro. faz referencia a class


        carro1.imprime();
        Carro.setVelocidadeLimite(180);
        carro2.imprime();
        carro3.imprime();

    }
}
