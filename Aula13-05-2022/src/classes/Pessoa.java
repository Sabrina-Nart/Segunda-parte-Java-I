
package classes;

public class Pessoa {
//Toda classe possui...
    
    //Atributos - ENCAPSULAMENTO - estão fechados nesse meio
    //Segurança
    private String nome; //Não está visível - visibilidade do Public até o }, fora ninguém encherga, bloqueados 
    private int idade;   //Previnir valores incorretos naquela idade, por exemplo
    private char sexo;
    private String profissao;
    
    //Métodos  
    //Categorias...
    //Construtores - iniciam os objetos - Pode ter vários construtores, mas desde que sejam em {} diferentes
     public Pessoa(){ //Interpretado pela presença do ()
      //Overlod = sobrecarga de método  - se colocar dentro, sem {} 
      //Valores iniciais
      //Valores Ficticios
      this.setNome("nome");
      this.setIdade(0);
      this.setSexo('F');
      this.setProfissao("sem profissão");
     }
     
    public Pessoa(String nome, int idade, char sexo, String profissao){ //Não sabe as informações, coloca em baixo    
      //Aqui já tem valor  
      this.setNome(nome); //Chama o método que tem validação e o atributo é privado
      this.setIdade(idade);
      this.setSexo(sexo);
      this.setProfissao(profissao); 
    }
     
    //Atribuição - Set
    public void setNome(String nome){ //Atribuir algo ao nome - Parametro, valor que não sabe qual é
       this.nome = nome.trim().isEmpty()?"NONAME":nome.toUpperCase(); //Localiza o atributo de método - Se não usar this não reconhece o nome de cima, só esse de baixo
    } 
    
    public void setIdade(int idade){ 
        this.idade = (idade < 0) || (idade > 150) ? 0 : idade; //Idade, 105 é um inteiro válido, mas não uma idade válida
    }
    
    public void setSexo(char sexo){
        this.sexo = (sexo!='M')&&(sexo!='F') ? 'E' : sexo;
    }
    
    public void setProfissao(String profissao){
        this.profissao=profissao.trim().isEmpty()?"NONAME":profissao.toUpperCase();
        //Se for branco, aparece o NONAME, com o copia cola que o professor fez, ficou com nome, dezendo que depois que passase pelo nome e não estive em branco, atribuia o nome
    }
    
    //Retorno - Get - nenhum deles é Void
    public String getNome(){
        return this.nome; //Retorna para poder ver,porque dentro do Public ao } não da para ver, porque é Private
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public char getSexo(){
        return this.sexo;
    }
    
    public String getProfissao(){
        return this.profissao;
    }
    
    //Retorno Booleano - is
    
    //toString - se não colocar nos objetos visíveis da problema
    @Override //- substitua aquele, por esse que estou fazendo
    public String toString(){
        return this.nome; //Identificar
    }
}
