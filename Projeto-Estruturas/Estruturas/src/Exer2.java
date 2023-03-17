import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        do {
            System.out.print("Digite entre 0 e 10: ");
            nota = scan.nextInt();
        } while (nota < 0 | nota > 10);

    }
}
