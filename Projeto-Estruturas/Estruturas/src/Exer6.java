import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número para cálculo: ");
        int numero = scan.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        System.out.println(numero + "! = " + fatorial);
    }
}
