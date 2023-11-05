
package testes;

import classes.Pessoa;

public class testePessoa {
    public static void main(String[] args) { //Dois contrutores 
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Josefa", 35, 'F', "não sei");
        
        System.out.println(pessoa1); //Se o cara que deveria botar . alguma coisa, não colocou, o toString assume essa função
        System.out.println(pessoa2);
        
    }
    
}
