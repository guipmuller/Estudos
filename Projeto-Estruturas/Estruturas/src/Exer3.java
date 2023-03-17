import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int contador = 0;
        int numero;
        int somaNumero = 0;
        int mediaNumero;
        int maiorNumero = 100;
        int menorNumero = 0;

        do {
            System.out.print("Digite o número entre 0 e 100: ");
            numero = scan.nextInt();
            somaNumero = somaNumero + numero;
            if (menorNumero > numero) {
                menorNumero = numero;
            }
            if (maiorNumero < numero) {
                maiorNumero = numero;
            }
            contador++;
        } while (contador < 5);

        mediaNumero = (somaNumero / 5);
        System.out.println("O maior é: " + maiorNumero);
        System.out.println("O menor é: " + menorNumero);
        System.out.println("A média é: " + mediaNumero);
    }
}
