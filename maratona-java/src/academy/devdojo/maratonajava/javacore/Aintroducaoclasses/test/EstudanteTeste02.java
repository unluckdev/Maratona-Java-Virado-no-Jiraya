package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        // new Estudante que cria o espaço em memoria com os atributos
        // new Estudante();
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante2.nome = "Sanji";

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("Estudante2 ---------------");
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);


    }
}
