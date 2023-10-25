package academy.devdojo.maratonajava.javacore.Gassosiacao.aula70.dominio;

/**
 * Crie um sitema que gerencie seminarios <br>
 * O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado<br><br>
 *
 * Um aluno poderá estar em apenas um seminário<br>
 * Um seminário poderá ter um ou vários alunos<br>
 * Um professor poderá ministrar vários seminários<br>
 * Um seminário deve ter um local<br><br>
 *
 * Campos Básicos (excluindo relacionamento)<br>
 * seminário: título<br>
 * aluno: nome, idade<br>
 * professor: nome, especialidade<br>
 * local: endereço<br>
 */
public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
