package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.nome = "Jiraya";
        pessoa.setNome("Jiraya");

//        pessoa.idade = 70;
        pessoa.setIdade(70);
        pessoa.imprimePessoa();
//        System.out.println(pessoa.getNome());
//        System.out.println(pessoa.getIdade());
    }
}
