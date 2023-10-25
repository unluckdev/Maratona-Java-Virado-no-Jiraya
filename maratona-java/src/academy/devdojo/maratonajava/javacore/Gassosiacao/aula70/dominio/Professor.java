package academy.devdojo.maratonajava.javacore.Gassosiacao.aula70.dominio;

public class Professor {
    private String nome;
    private String especialide;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialide) {
        this.nome = nome;
        this.especialide = especialide;
    }

    public Professor(String nome, String especialide, Seminario[] seminarios) {
        this.nome = nome;
        this.especialide = especialide;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("--- ---");
        System.out.println("Professor: " + this.nome);
        if (this.seminarios == null) return;
        System.out.println("## Seminários cadastrados ###");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("**Alunos**");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + ", idade: " + aluno.getIdade());
            }
        }
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialide() {
        return especialide;
    }

    public void setEspecialide(String especialide) {
        this.especialide = especialide;
    }
}
