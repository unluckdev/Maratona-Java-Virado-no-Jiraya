package academy.devdojo.maratonajava.introducao;

// IF Sempre recebe um boolean
public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        /*if (true) {
            System.out.println("Dentro do IF");
        }
        System.out.println("Fora do IF");
        */

        int idade = 15;
        boolean isAutorizado = idade >= 18;

        if (isAutorizado) {
            System.out.println("Autorizado a compra bebida alcólica");
        }

        if (!isAutorizado) { //! operador negação --for de ler
            // se não autorizado então execute
            System.out.println("Não autorizado a compra bebida alcólica");
        }

        boolean c = false;
        if (c == false) {
            System.out.println("Dentro de algo que não deve acontecer");
        }
        int idadeCliente = 15;
        boolean isAutorizadoComprarBebida = idadeCliente >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcólica");


        }
    }
}