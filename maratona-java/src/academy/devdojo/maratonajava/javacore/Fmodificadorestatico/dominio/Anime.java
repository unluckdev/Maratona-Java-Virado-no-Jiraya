package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private static int[] episodios;
    private String genero;
    private String estudio;

    //    bloco de inicialização
    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[5];
        for (int i = 0; i < Anime.episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }


    //CONSTRUCTOR
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }


    //  SETS GETS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

//    public void setEpisodios(int[] episodios) {
//        this.episodios = episodios;
//    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getEstudio() {
        return this.estudio;
    }

}
