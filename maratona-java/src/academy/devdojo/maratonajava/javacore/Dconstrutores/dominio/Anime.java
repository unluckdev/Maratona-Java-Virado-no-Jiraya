package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    //construtor
    public Anime(String nome, String tipo, int episodios, String genero){
        this(); //ESSE THIS() Chama o construtor sem argumentos nos parentes
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;


    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero);//procura o construtor que tem esses atributos
        this.estudio = estudio;


    }

    //construtores não são métodos
    public Anime(){
        System.out.println("Dentro do construtor sem argumentos.");
    }


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
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
