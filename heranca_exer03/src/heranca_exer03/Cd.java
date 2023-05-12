
package heranca_exer03;

public class Cd extends Produto{
   private String nome ;

    public Cd(String título, double preço) {
        super(título, preço);
    }

    public Cd(String nome, String título, double preço) {
        super(título, preço);
        this.nome = nome;
    }
    

    @Override
    public String exiberDetalhes() {
        return super.exiberDetalhes()+"\nNome da Banda="+this.nome;
    }
    

    @Override
    public double calcularDesconto() {
    return super.getPreço()*0.05;
    }
   
    
}
