package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    //construtor
    public Anime(){

    }


    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios, genero);
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }


    ///////  GET SET
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    int getEpisodios() {
        return this.episodios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return this.nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
