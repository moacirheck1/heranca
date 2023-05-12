package heranca_exer03;

public abstract class Produto {
//    1. Crie uma classe abstrata chamada Produto com os seguintes atributos privados:

    private String título;
    private double preço;

    public Produto(String título, double preço) {
        this.título = título;
        this.preço = preço;
    }

   public abstract double calcularDesconto();
   public String exiberDetalhes(){
       return "Titulo="+this.título+"\nPreco="+this.preço+"\nDesconto="+calcularDesconto()+"\nValor Final="+(this.preço-calcularDesconto());
   }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
   
}
