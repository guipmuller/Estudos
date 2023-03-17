import java.util.Random;

public class Exer9 {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int[] numeros = new int[20];
        int entrada = 0; 

        for (int i = 0; i < numeros.length; i++) {
            entrada = aleatorio.nextInt(100);
            numeros[i] = entrada;
        }

        for (int i : numeros) {
            System.out.println(i);
            System.out.println("suces. " + (i+1));
        }
    } 
}
