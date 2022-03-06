import java.util.*;
import javax.swing.JOptionPane;


public class Main {

    public static void Maior_diferença(int vetor[]){
        
        Arrays.sort(vetor);
        int N = vetor.length -1;
        int Dif = vetor[N] - (vetor[0]);
        JOptionPane.showMessageDialog(null,"Maior diferença entre os resultados é de : "+Dif);
        
    }

    public static boolean Ordem(int vetor[]){
       int C =0;
        for (int i = 0; i < vetor.length - 1; i++) {

            if (vetor[i] < vetor[i + 1]) {
                
                C++;
     
            }
        
        if (C == vetor.length - 1){
            JOptionPane.showMessageDialog(null, "Vetor está em ordem Crescente!");
                return true;
        }
        }
        
        return false;
       


    }

    public static void main(String[] args){
        int N = Integer.parseInt((JOptionPane.showInputDialog(null,"Digite o tamanho do vetor: ")));

        int vetor[] = new int[N];
        for(int x =0; x < N; x++){
            int D = Integer.parseInt((JOptionPane.showInputDialog(null,"Digite números positivos e negativos, incluindo o 0 :")));
            vetor[x] = D;
            }
        
        Maior_diferença(vetor);
        Ordem(vetor);
        }
        
}

