package academy.devdojo.maratonajava.javacore.Eblocodinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    //1 - Alocado espaço nem memória para o objeto
    //2 - Cada atributo de classe é criado e inicializado com  valores default ou o que for passado
    //3 - Bloco de inicizalição executado
    //4 - Construtor é executado


    //bloco de inicialização ou instancia
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < this.episodios.length; i++) {
            this.episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }

        System.out.println();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    public int[] getEpisodios() {
        return episodios;
    }


}
