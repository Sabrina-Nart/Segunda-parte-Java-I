
package arrays;
                
import javax.swing.JOptionPane;

//For melhor para rray
public class exemploArray {    //[] reconhecido como array
    
    public static void lerVetor(String[] nomes) { //Aqui é só parâmetro
        //Base para um array
        for (int i = 0; i < nomes.length; i++) {  //Length = tamanho = tamanho do array nesse caso
             nomes[i] = JOptionPane.showInputDialog("Nome"); //Tem que dizer qual que vai reber, porque agora não é mais uma variável
        }  
    } 
    
    public static void mostraVetor(String[] nomes) {  
      //Se colocar o igual depois do sinal de menor, ele vai atrás de um campo que não existe - de 0 a 4, vai atrás do 5, mas o limite 5 não existe
        for (int i = 0; i < nomes.length; i++) {  
          System.out.println(nomes[i]); //Percorrer vetor não tem milagra, tem que percorrer todos 
        //O for funcionou, se não colocar o i e deixar só o parametro, aparece o endereço da memória onde o array está alocado
        }           
    }
    
    public static void main(String[] args) { //Parametro Java = (String[] args)=como receber um vetor 
        
        //int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Tamanho: "));
        //String[] nomes = new String[tamanho]
        
        String[] nomes = new String[Integer.parseInt(JOptionPane.showInputDialog("Tamanho: "))]; //Ele está declarado, não pronto para ser executado - Não da erro de execução
        lerVetor(nomes); //Leitura aqui
        mostraVetor(nomes);
        
    }
}
