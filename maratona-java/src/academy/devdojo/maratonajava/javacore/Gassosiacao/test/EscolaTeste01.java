package academy.devdojo.maratonajava.javacore.Gassosiacao.test;

import academy.devdojo.maratonajava.javacore.Gassosiacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassosiacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Jiraya Sensei");
        Professor professor02 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor01, professor02};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();



        


    }
}
