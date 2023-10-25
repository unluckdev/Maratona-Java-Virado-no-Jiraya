package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Endereco endereco = new Endereco();
        endereco.setCidade("Hachinosu");
        endereco.setCep("012345-67");
        endereco.setRua("Rua Xebec, n 5");
        funcionario.setNome("Marshall D. Teach");
        funcionario.setCpf("11111111");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(200000.5d);

        funcionario.imprime();
    }
}
