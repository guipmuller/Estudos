import java.util.Scanner;

public class Exer8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];
        int contador = 0;

        System.out.println("Digite as letras:");

        for (int i = 0; i < consoantes.length; i++) {
            String letra;
            letra = scan.next();
            if (!(letra.equalsIgnoreCase("a")| 
                letra.equalsIgnoreCase("e")| 
                letra.equalsIgnoreCase("i")| 
                letra.equalsIgnoreCase("o")| 
                letra.equalsIgnoreCase("u"))){
                    consoantes[i] = letra;
                    contador++;
             }
        }
        
        System.out.println("##########");

        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.println(consoante);
            }
        }

        System.out.println("Consoantes: " + contador);
    }
}