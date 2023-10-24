package academy.devdojo.maratonajava.javacore.Gassosiacao.test;

import academy.devdojo.maratonajava.javacore.Gassosiacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassosiacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Ronaldo");
        Time time = new Time("Brasil");
        Jogador[] jogadres = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);

        //jogador1.setTime(time);
        time.setJogadores(jogadres);

        System.out.println("--- Jogado ---"); // Ponto de vista Jogador
        jogador1.imprime();

        System.out.println("--- Time ---"); // Ponto de vista time
        time.imprime();




    }
}
