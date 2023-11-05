
package Metodos;      //Métodos = retorno(tipo) - sem retorno = Void

//import javax.swing.JOption
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

//Pane;

public class exemploMetodos {
    public static boolean isMaiorIdade(int idade){ //método não pode ser grudado em algo = quando mais livre melhor
        return (idade >= 18); //Boolean = é ou não é - Para métodos booleanos isso é ok - Redução de IF      
    }
    
    public static double reajustaSalario(int idade, double salario){ //Colocar na ordem certa, se primeiro é inteiro, depois é inteiro tamném
      
     /*   if (isMaiorIdade(idade)){ //Uma forma de fazer
            return (salario * 1.1); //Porcentagem
        }else{
            return (salario * 1.05);
        }   */ 
        
        return isMaiorIdade(idade) ? (salario * 1.1) : (salario * 1.05); //A diferença está na forma que se faz    
    }
    
    public static void main(String[] args) {
        double salarioAnterior=0, salarioAtual=0;
        
        JTextArea area = new JTextArea(10,30); //Declarado fora, porque vai ser usado fora - linha e coluna
        
        do {            
           String nome = JOptionPane.showInputDialog(null,"Digite seu nome "); //Não declara porque já é String, só reconhece String,por isso precisa converter
           int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
           double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu sálario"));
           
           double novoSalario = reajustaSalario(idade, salario);
           
          // area.setText(nome); //Substitui = no final sobra só um                         \t = Como se fosse o Tab do teclado
           //Colocar na sequência 
           area.append(nome + "\t" + idade + "\t" + salario + "\t" + novoSalario + "\n"); //Vai adicionando - tem um valor, vai adicionando - \n = quebra as linhas
           
           salarioAnterior += salario; //Dois Totalizadores - para aparecer o total no final
           salarioAtual += novoSalario; 
           
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?")==0);

        area.append("Total do Salário: " +salarioAnterior + "\t  Novo Salário: " + salarioAtual);
        JOptionPane.showInputDialog(null, area); //Sem esse não mostra, porque não mandou mostrar
        
    }
}
