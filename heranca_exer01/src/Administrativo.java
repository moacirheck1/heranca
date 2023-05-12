
public class Administrativo extends Funcionario {

    private String setor;

    public Administrativo(String setor, String nome, int idade, double salário) {
        super(nome, idade, salário);
        this.setor = setor;
    }

  

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes()+
                "\nSetor=" + this.setor;
    }

    @Override
    public double calcularBonusSalario() {
        return super.getSalário()*0.05;
    }

}
