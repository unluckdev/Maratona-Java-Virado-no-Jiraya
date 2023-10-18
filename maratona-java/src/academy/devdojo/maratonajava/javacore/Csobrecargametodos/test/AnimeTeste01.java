package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime(); //() esse parenteses é um construtor
        anime.init("One Piece", "TV", 1086);
        anime.setGenero("Ação");
        anime.imprime();

    }
}
