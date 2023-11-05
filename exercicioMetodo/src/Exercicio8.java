
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Exercicio8 {
    
    public static void lerVetores(String[] nomes, double[] precos){ //só para ler, não vai modificar
        for (int i = 0; i < nomes.length; i++) { //Os dois tem o mesmo tamanho,por isso tanto faz qual colocar
           nomes[i] = JOptionPane.showInputDialog("Nomes").toUpperCase();
           precos[i] = Double.parseDouble(JOptionPane.showInputDialog("Preços"));
        }
    }
    
    public static double retornaNovoPreco(double preco){
        double novoPreco=0;
        if (preco < 10){
            novoPreco = preco * 1.08;
        }
        if ((preco >= 10) && (preco <= 20)){
            novoPreco = preco * 1.06;
        }
        if (preco > 20) {
            novoPreco = preco * 1.05;
        }
        return novoPreco;
    }
    
    public static void alteraPrecos(double[] precos){
        for (int i = 0; i < precos.length; i++) {
            precos[i] = retornaNovoPreco(precos[i]); //Quer alterar só um um - aqueleque está na posição
        }
    }
    
    public static void mostraVetores(String[] nomes,double[] precos, JTextArea area){
        for (int i = 0; i < nomes.length; i++) {
          area.append(nomes[i] + "\t" + precos[i] + "\n");
        }
    }
    
    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Tamanho do array"));
        String[] nomes = new String[tamanho]; //-| 
        double[] precos = new double[tamanho];
        
        lerVetores(nomes, precos); //Métodos
        
        JTextArea area = new JTextArea(10,20);
        
        mostraVetores(nomes, precos, area);
        
        JOptionPane.showInputDialog(null, area);
        
    }
    
}
