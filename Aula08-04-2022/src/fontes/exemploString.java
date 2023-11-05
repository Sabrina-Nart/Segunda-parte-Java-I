                    //A SEQUÊNCIA INFLUÊNCIA - PRIMEIRO PARÂMETRO, SEGUNDO PARÂMETRO
package fontes;
                
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class exemploString {
    //Se não colocar o parâmetro, o erro não some, porque esse espera por algo
    //ShowImputDialog, devolve uma String, dessa String deixa em maiúsculo, depois joga no vetor
    
    public static void lerVetor(String[] vetor){ //Copia e cola o que antes do =, porque é o que interessa
        for (int i = 0; i < vetor.length; i++) {
          vetor[i] = JOptionPane.showInputDialog("Digite um nome").trim().toUpperCase();   
        }
    }
    
    public static void mostraUltimoCaracter(String[] vetor,JTextArea area){
        area.append("---Último caracter de cada palavra---\n");
        for (int i = 0; i < vetor.length; i++) {
            area.append(vetor[i] + "\t" + vetor[i].charAt(vetor[i].length() -1) + "\n"); 
            //vetor na posição i traz joao, depois vai para a posição do vetor, começa do 0, conta 4, mas são 3, então diminui -1
        }
    }
    
    public static void mostraInicial( String[] vetor, JTextArea area, String inicial){
        area.append(("Nomes que iniciam com " + inicial + "\n"));
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].startsWith(inicial)){ //Nesse caso dependemos do usuário, porque colocamos até agora o UpperCase, aqui não tem, se ele colocar em minusculo, da problema
                area.append(vetor[i] + "\n"); //Foi colocado para converter para maísculo em baixo
            }
        }
    }    
    
    public static void main(String[] args) {
        
        //Preencher o Vetoe
        String[] vetor = new String[Integer.parseInt((JOptionPane.showInputDialog("Número da quantidade de nomes que deseja filtrar")))]; 
        //Vários métodos e cada um mostra o vetor com alguma informação
        //Faz um método e chama o vetor por argumento
        lerVetor(vetor); //Método que preenche o vetor
        
        JTextArea area = new JTextArea(20, 30); //Linha e Coluna
        //Mostrar o último caracter de cada string
        mostraUltimoCaracter(vetor, area); //Passa o area por parâmetro, porque vai mostrar no TextArea
        
        String inicial = JOptionPane.showInputDialog("Digite a inicial de um nome no qual deseja fazer um filtro").toUpperCase();
        mostraInicial(vetor, area, inicial); //Todas as String do vetor que começam com a inicial que o usuário digitar
        
        JOptionPane.showInputDialog(null, area); //MOSTRAR   
        
        //Usaria se não tivesse o showConfirmDialog
        String opcao = ""; //Declarado fora
        do { 
            opcao = 
           JOptionPane.showInputDialog("Deseja continuar").toUpperCase(); //Coloca como Maiusculo e testa como minusculo = erro
        }while(opcao.equals("S"));//Enquanto opção com equals for S = testa
    }
    
}
