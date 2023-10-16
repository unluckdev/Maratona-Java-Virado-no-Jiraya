package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

/**
 * Crie uma classe Funcionário  com os seguintes  atributos
 * nome
 * idade
 * salario // tres salarios devem ser aguardados
 * <p>
 * crie dois métodos
 * 1. Para imprimir  os dados
 * 2. Para tirar a média dos salarios e imprimir o resultado
 */
public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeFuncionario() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (this.salarios != null) {
            for (double salario : this.salarios) {
                System.out.print(salario + " ");
            }
        }
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {
        if (this.salarios == null) {
            return;
        }

        double somaSalario = 0;
        for (double salario : this.salarios) {
            somaSalario += salario;
        }
        System.out.println("\nMedia salarial R$ " + somaSalario / this.salarios.length);


    }
}