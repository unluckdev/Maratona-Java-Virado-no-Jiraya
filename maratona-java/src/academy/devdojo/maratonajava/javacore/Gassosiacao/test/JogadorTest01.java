package academy.devdojo.maratonajava.javacore.Gassosiacao.test;

import academy.devdojo.maratonajava.javacore.Gassosiacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Ronaldo");
        Jogador jogador03 = new Jogador("Romário");

        Jogador[] jogadores = {jogador01, jogador02, jogador03};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
