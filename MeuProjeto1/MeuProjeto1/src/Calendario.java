import java.util.Scanner;

public class Calendario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do mês (1-12): ");
        int ano = scanner.nextInt();

        if (ano == 1) {
            System.out.println("Jan");
        } else if (ano == 2) {
            System.out.println("Fev");
        } else if (ano == 3) {
            System.out.println("Mar");
        } else if (ano == 4) {
            System.out.println("Abr");
        } else if (ano == 5) {
            System.out.println("Mai");
        } else if (ano == 6) {
            System.out.println("Jun");
        } else if (ano == 7) {
            System.out.println("Jul");
        } else if (ano == 8) {
            System.out.println("Ago");
        } else if (ano == 9) {
            System.out.println("Set");
        } else if (ano == 10) {
            System.out.println("Out");
        } else if (ano == 11) {
            System.out.println("Nov");
        } else if (ano == 12) {
            System.out.println("Dez");
        } else {
            System.out.println("Por favor, digite entre 1 e 12");
        }

        if (ano == 7 || ano == 12 || ano == 1) {
            System.out.println("Férias");    
        }

        System.out.println("Digite o dia da semana");
        System.out.print("(seg ter qua qui sex sab dom): ");
        String diaSemana = scanner.next();

        switch (diaSemana) {
            case "seg":
                System.out.println("1");
                break;
            case "ter":
                System.out.println("2");
                break;
            case "qua":
                System.out.println("3");
                break;
            case "qui":
                System.out.println("4");
                break;
            case "sex":
                System.out.println("5");
                break;
            case "sab":
                System.out.println("6");
                break;
            case "dom":
                System.out.println("7");
                break;
            default:
                System.out.println("Digite um dia da semana conforme o exemplo");
                break;
        }

        switch (ano) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Talvez");
                break;
            case 5:
                System.out.println("Errado");
                break;    
            default:
                System.out.println("Valor indefinido");
                break;
        }
        scanner.close();
    }
    
}
