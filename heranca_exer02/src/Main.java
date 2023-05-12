
public class Main {

    public static void main(String[] args) {

        Veiculo pampa = new Carro(2, "Ford", "Pampa", 1990);
        Veiculo cg125 = new Moto(true, "Honda", "Cg 125", 2000);
        System.out.println(pampa.exibeDetalhes());
        System.out.println(cg125.exibeDetalhes());

    }
}
