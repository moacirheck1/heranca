
public class Main {

    public static void main(String[] args) {

        Veiculo pampa = new Carro(2, "Ford", "Pampa", 1990);
        Veiculo gol = new Carro(2, "vw", "gol", 1990);
        Veiculo fusca = new Carro(2, "vw", "fusca", 2000);
        Veiculo opala = new Carro(2, "chevrolet", "Pampa", 1991);
        Veiculo chevette = new Carro(2, "chevrolet", "chevette", 1992);
        Veiculo cg150 = new Moto(true, "Honda", "Cg 150", 2006);
        Veiculo bros = new Moto(true, "Honda", "Bros", 2007);
        Veiculo bis = new Moto(true, "Honda", "bis 125", 2020);
        Veiculo cg125 = new Moto(true, "Honda", "Cg 125", 2000);
        Veiculo pop = new Moto(true, "Honda", "pop 100", 2018);
        System.out.println(pampa.exibeDetalhes());
        System.out.println(gol.exibeDetalhes());
        System.out.println(fusca.exibeDetalhes());
        System.out.println(opala.exibeDetalhes());
        System.out.println(chevette.exibeDetalhes());
        System.out.println(cg150.exibeDetalhes());
        System.out.println(bros.exibeDetalhes());
        System.out.println(bis.exibeDetalhes());
        System.out.println(cg125.exibeDetalhes());
        System.out.println(pop.exibeDetalhes());
     

    }
}
