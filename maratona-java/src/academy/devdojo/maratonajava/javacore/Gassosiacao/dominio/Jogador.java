package academy.devdojo.maratonajava.javacore.Gassosiacao.dominio;

public class Jogador {
    private String nome;

    //    CONSTRUTOR
    public Jogador(String nome) {
        this.nome = nome;
    }

    //    método
    public void imprime() {
        System.out.println(this.nome);
    }


    //    SET GET
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
