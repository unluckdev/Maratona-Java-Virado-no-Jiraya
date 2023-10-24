package academy.devdojo.maratonajava.javacore.Gassosiacao.test;

import academy.devdojo.maratonajava.javacore.Gassosiacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassosiacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Time time = new Time("PSG");

        jogador01.setTime(time);

        jogador01.imprime();

    }
}
