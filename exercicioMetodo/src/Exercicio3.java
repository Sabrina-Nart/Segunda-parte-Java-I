
import javax.swing.JOptionPane;


public class Exercicio3 {
    
    public static void mostraSequencia(int numero){ //Porque mostra e vai embora
        for (int i = numero; i > 0 ; i--) { //Aqui a variável numero é uma coisa, embaixo é outra
            System.out.print(i + " - "); //ln=quebra a linha
        }
    }
    public static void main(String[] args) {
       // int numero = Integer.parseInt((JOptionPane.showInputDialog(null, "Qual número deseja ver em sequência?")));
       mostraSequencia(Integer.parseInt(JOptionPane.showInputDialog("Qual número deseja ver em sequência?")));
       //Segue a lógica de quem é executado primeiro - showImputDialog, depois converte e depois é oresto
    }
    
}
