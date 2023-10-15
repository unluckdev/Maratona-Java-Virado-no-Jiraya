package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Luffy";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "Robin";
        estudante02.idade = 30;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
