
public abstract class Veiculo {
//    classe abstrata chamada Veiculo

    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract double calcularVelocidadeMaxima();

    public String exibeDetalhes() {
        return "Marca=" + this.marca + "\nModelo=" + this.modelo + "\nAno=" + this.ano + "\nVelocidade Maxima=" + calcularVelocidadeMaxima()+"km/h";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
