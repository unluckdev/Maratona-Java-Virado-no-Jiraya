package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Aldeia da Folha, Bairro Uchiha, Rua 3");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Itachi");
        pessoa.setCpf("1111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
    }
}
