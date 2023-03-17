import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int resultado = 0;
        System.out.print("Digite o valor da tabuada: ");
        int tabuada = scan.nextInt();
        System.out.println("Tabuada de " + tabuada);
 
        for (int i = 1; i <= 10; i++) {
            resultado = tabuada * i;
            System.out.println(tabuada + " x " + i + " = " + resultado);
        }
    }
}
