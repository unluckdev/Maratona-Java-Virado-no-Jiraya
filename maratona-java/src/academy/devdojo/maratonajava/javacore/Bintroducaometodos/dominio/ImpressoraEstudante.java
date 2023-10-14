package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudate){
        System.out.println("----------------------");
        System.out.println(estudate.nome);
        System.out.println(estudate.idade);
        System.out.println(estudate.sexo);
    }
}
