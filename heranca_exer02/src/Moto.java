
public class Moto extends Veiculo{
    private boolean partida;

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public Moto(boolean partida, String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.partida = partida;
    }

    @Override
    public String exibeDetalhes() {
       String part="";
        if(partida){
             part="Sim";
        }else
            part="Nao";
        return super.exibeDetalhes()+"\nPartida eletrica:"+part;
    }
    
    
    

    @Override
    public double calcularVelocidadeMaxima() {
       return 180;
    }
}
