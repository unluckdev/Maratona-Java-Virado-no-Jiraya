package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.marca = "Dodge";
        carro01.modelo = "Charger";
        carro01.ano = 1970;

        carro02.marca = "Chevrolet";
        carro02.modelo = "Impala";
        carro02.ano = 1964;

        carro02 = carro01;

        System.out.println("Carro: " + carro01.marca + " Modelo: " + carro01.modelo + " Ano: " + carro01.ano);
        System.out.println("\n-----------------");
        System.out.println("Carro: " + carro02.marca + " Modelo: " + carro02.modelo + " Ano: " + carro02.ano);

    }
}
