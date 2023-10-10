package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo
entre <> e imprima a seguinte mensagem:
Em <>, morando no endereço <endereço>,
confirmo que recebi o slário de <>, na <data>


 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Augusto";
        String endereco = "Calle 68 n223";
        float salario = 2500.53f;
        String dataRecebimento = "10/10/2023";
        String relatorio = "Eu <" + nome + ">, morando no endereço <" + endereco + ">, confirmo que recebi o salário de <" + salario + ">, na data <" + dataRecebimento + ">";
        System.out.println(relatorio);

    }
}
