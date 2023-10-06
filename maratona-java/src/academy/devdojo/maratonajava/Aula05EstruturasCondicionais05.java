package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprima o dia da semana considerando o 1 como doming
        byte dia = 8;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido!");
        }

        char sexo = 'M';
        switch (sexo){
            case 'F':
                System.out.println("Mulher");
                break;
            case 'M':
                System.out.println("Homem");
                break;
            default:
                System.out.println("Sexo Inválido");
        }
    }
}
