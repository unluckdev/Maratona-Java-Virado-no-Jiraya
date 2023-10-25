package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println("Cidade: " + this.endereco.getCidade() + " " + this.endereco.getRua() + " Cep: " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
