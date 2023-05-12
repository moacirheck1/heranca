
public class Carro extends Veiculo{
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public Carro(int numeroPortas, String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }
    

    @Override
    public double calcularVelocidadeMaxima() {
       return 200;
    }
    
}
