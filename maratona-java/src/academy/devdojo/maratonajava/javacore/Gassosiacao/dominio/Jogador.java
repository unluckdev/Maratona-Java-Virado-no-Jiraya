package academy.devdojo.maratonajava.javacore.Gassosiacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    //    CONSTRUTOR
    public Jogador(String nome) {
        this.nome = nome;
    }

    //    método
    public void imprime() {
        System.out.println(this.nome);
        if (time != null) {
            System.out.println(time.getNome());
        }
    }


    //    SET GET
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
