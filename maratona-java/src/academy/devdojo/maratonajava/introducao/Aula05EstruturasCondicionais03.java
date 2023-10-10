package academy.devdojo.maratonajava.introducao;

// Doar se salario > 5000
public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 5000;
        /* String mensagemDoar = "Eu vou doar 500 por DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas ainda vou ter!";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        */

        String resultado = salario > 5000 ? "Eu vou doar 500 por DevDojo" : "Ainda não tenho condições, mas ainda vou ter!";

       /* if (salario > 5000){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }*/


        System.out.println(resultado);

    }
}
