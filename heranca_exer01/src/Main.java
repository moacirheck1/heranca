
public class Main {
    public static void main(String[] args) {
      Funcionario henrique=new Professor("Historia", "Henrique", 20, 1312);
      Funcionario moacir=new Administrativo("administracao", "Moacir", 20, 1300);
        System.out.println(henrique.exibirDetalhes());
        System.out.println(moacir.exibirDetalhes());
  
    }
}
