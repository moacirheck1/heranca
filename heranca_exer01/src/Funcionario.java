
public abstract class Funcionario {

    private String nome;
    private int idade;
    private double salário;

    public Funcionario(String nome, int idade, double salário) {
        this.nome = nome;
        this.idade = idade;
        this.salário = salário;
    }

    public abstract double calcularBonusSalario();

    public  String exibirDetalhes(){
       return  "Nome="+this.nome+"\nIdade="+this.idade+"\nSalario="+this.salário+
                "\nBonus= "+calcularBonusSalario()+"";
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalário() {
        return salário;
    }

    public void setSalário(double salário) {
        this.salário = salário;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", idade=" + idade + ", sal\u00e1rio=" + salário + '}';
    }

}
