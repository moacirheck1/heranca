
package heranca_exer03;

public class Heranca_exer03 {

    public static void main(String[] args) {
       Produto cdBandas=new Cd("Gustavo Lima", "Musicas", 10);
       Produto livro=new Livro("Vagalume","Os pequenos Jangadeiros", 80);
        System.out.println(livro.exiberDetalhes());
        System.out.println(cdBandas.exiberDetalhes());
    }
    
}
