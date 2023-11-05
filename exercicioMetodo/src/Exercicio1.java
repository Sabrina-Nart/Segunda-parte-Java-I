
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Exercicio1 {
   
  public static boolean numeroPar(int numero){ //Exercício 1
    return (numero % 2 == 0); 
  }
  
  public static void main(String[]args){  //Exercício 2
     JTextArea area = new JTextArea(10,20); //número de linhas e colunas
      do {          
         int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "));
             area.append(numeroPar(numero) ? numero + " é par\n" : "");
                 
      }while(JOptionPane.showConfirmDialog(null, "Você deseja continuar?")==0);
      
      JOptionPane.showConfirmDialog(null, area);
  }
}
