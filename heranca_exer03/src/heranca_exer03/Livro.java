
package heranca_exer03;

public class Livro extends Produto{
     private String autor;

    public Livro(String título, double preço) {
        super(título, preço);
    }

    public Livro(String autor, String título, double preço) {
        super(título, preço);
        this.autor = autor;
    }
    

    @Override
    public String exiberDetalhes() {
        return super.exiberDetalhes()+"\nAutor="+this.autor;
    }

    @Override
    public double calcularDesconto() {
       return super.getPreço()*0.10;
    }
    
}
