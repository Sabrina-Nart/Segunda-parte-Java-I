
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Exercicio6 {

  public static void geraArray(int[] vetor){
      Random r = new Random(); //Gera números aleatórios
      
      for (int i = 0; i < vetor.length; i++) { 
          vetor[i] = r.nextInt(50); //Segundo nesxtInt - Gera de 0 a 49
      }
  }
  
    public static void mostraVetor(int[] vetor, JTextArea area) {
        for (int i = 0; i < vetor.length; i++) {
            area.append(vetor[i]+"\n");
        }
    }
  
    public static int retornaSoma(int[] vetor){ //Retorna = não é void
        int soma = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;        
    }
    
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Tamanho"));
        int[] vetor = new int[tamanho];
        geraArray(vetor); //Precisa gerar o vetor
        JTextArea area = new JTextArea(10,20);
        mostraVetor(vetor, area);
        int soma = retornaSoma(vetor);
        double media = retornaSoma(vetor) / (double)vetor.length; //Inteiro com inteiro retorna inteiro, por isso coloca o double
        area.append("Soma: " + soma + "\n");
        area.append("Média: " + media + "\n");
        JOptionPane.showMessageDialog(null, area);
    }
    
}
