package academy.devdojo.maratonajava.javacore.Gassosiacao.aula70.test;

import academy.devdojo.maratonajava.javacore.Gassosiacao.aula70.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassosiacao.aula70.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassosiacao.aula70.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassosiacao.aula70.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Novo mundo, Alabasta");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Shanks", "Yonkou");
        Aluno[] alunosParaSeminario = {};

        Seminario seminario = new Seminario("One Piece", alunosParaSeminario, local);
        Seminario seminario2 = new Seminario("Como se tornar um Yonkou", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario, seminario2};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
