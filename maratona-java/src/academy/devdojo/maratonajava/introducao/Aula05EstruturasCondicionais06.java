package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7 informe se é dia útil ou final de semana
        // Considerando 1 como domgin
        byte dia = 4;
        switch (dia){
            /*case 1:
                System.out.println("Final de Semana");
                break;
            case 2:
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Fim de Semana");
                break;
            */
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");

            /*
            case 1, 7:
                System.out.println("Fim de Semana");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Dia útil");
            */
            default:
                System.out.println("Dia inválido");
        }

    }
}
