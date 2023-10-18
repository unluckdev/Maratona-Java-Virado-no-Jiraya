package academy.devdojo.maratonajava.javacore.Dconstrutores.teste;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
       Anime anime = new Anime("Bleach", "TV", 560, "Ação", "Production IG");

       anime.imprime();
    }
}
