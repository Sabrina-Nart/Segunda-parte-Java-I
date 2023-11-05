
package classes;

public class Produto {
    //membros de classe
    //atributos
    private String nome;
    private String unidade;
    private double estoque;
    private double custo;
    private double venda;
    private boolean ativo;
    
    //metodos
    //construtores
    public Produto(){
        this.setNome("PADRÃO");
        this.setUnidade("UN");
        this.setEstoque(0);
        this.setCusto(0);
        this.setVenda(0);
        this.setAtivo(false);
    }
    public Produto(String nome, String unidade, double estoque, double custo, double venda, boolean ativo){
        this.setNome(nome);
        this.setUnidade(unidade);
        this.setEstoque(estoque);
        this.setCusto(custo);
        this.setVenda(venda);
        this.setAtivo(ativo);
    }
    
    //atribuição - set
    public void setNome(String nome){
        this.nome = nome.trim().isEmpty()? "SEM NOME" : nome.toUpperCase();
    }
    public void setUnidade(String unidade){
        this.unidade = unidade.trim().isEmpty()? "UN" : unidade.toUpperCase();
    }
    public void setEstoque(double estoque){
        this.estoque = estoque;
    }
    public void setCusto(double custo){
        this.custo = custo < 0 ? 0 : custo;
    }
    public void setVenda(double venda){
        this.venda = venda < 0 ? 0 : venda;
    }    
    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }
    
    //retorno - get
    public String getNome(){
        return this.nome;
    } 
    public String getUnidade(){
        return this.unidade;
    }    
    public double getEstoque(){
        return this.estoque;
    }    
    public double getCusto(){
        return this.custo;
    }    
    public double getVenda(){
        return this.venda;
    }    
    public boolean isAtivo(){
        return this.ativo;
    }    
    //toString
    @Override
    public String toString(){
        return this.nome;
    }
}
