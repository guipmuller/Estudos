import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int numero;
        do {
            System.out.print("Insira o número ou 0 para finalizar: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        } while (numero != 0);
        System.out.println("Foram " + (pares - 1) + " números pares");
//      o número 0 de saída adiciona mais uma unidade aos pares
        System.out.println("Foram " + impares + " números ímpares");
    }    
}
