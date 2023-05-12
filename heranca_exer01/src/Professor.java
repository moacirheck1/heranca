
public class Professor extends Funcionario{
private  String disciplina ;

    public Professor(String disciplina, String nome, int idade, double salário) {
        super(nome, idade, salário);
        this.disciplina = disciplina;
    }
    public Professor(String nome, int idade, double salário) {
        super(nome, idade, salário);
    }
    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes()+ "\nDisciciplina="+this.disciplina;
    }
    
//. O bônus salarial para
//professores será fixado em 10% do salário.

    @Override
    public double calcularBonusSalario() {
        return super.getSalário()*0.10;
    }
    
}
