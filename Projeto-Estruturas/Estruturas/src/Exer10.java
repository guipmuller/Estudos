import java.util.Random;

public class Exer10 {
    public static void main(String[] args) {
        Random aleatorios = new Random();

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorios.nextInt(9);
            }
        }
        
        for (int[] linha : matriz) {
            for (int coluna : linha) {
                System.out.print(coluna + " "); 
            }
            System.out.println();
            
        }
    }    
}
