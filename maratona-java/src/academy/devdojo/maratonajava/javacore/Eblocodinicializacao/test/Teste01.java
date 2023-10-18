package academy.devdojo.maratonajava.javacore.Eblocodinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocodinicializacao.domain.Anime;

public class Teste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        for (int episodios : anime.getEpisodios()) {
//            System.out.print(episodios + " ");
//        }
        System.out.println(anime.getEpisodios()[0]);

    }
}
