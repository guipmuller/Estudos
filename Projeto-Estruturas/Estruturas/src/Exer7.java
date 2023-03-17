public class Exer7 {
    public static void main(String[] args) {
        
        int[] vetor = {-5, -6, 15, 58, 8, 4};

        int count = 0;
        System.out.println(vetor); //local na memória
        System.out.println(vetor.length); //tamanho do vetor
        while (count < vetor.length) {
            System.out.println(vetor[count]);
            count++;    
        }
        System.out.println("Separa");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);

        }
        
    }
}
