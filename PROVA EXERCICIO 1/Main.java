public class Main {
    public static void main(String[] args) {
        double valorCarga = 10000.00;

        ContratacaoService contratacaoRodoviaria = new ContratacaoRodoviariaService();
        ContratacaoService contratacaoAerea = new ContratacaoAereaService();
        ContratacaoService contratacaoMaritima = new ContratacaoMaritimaService();

        contratacaoRodoviaria.contratarFrete("Empresa Alfa Ltda", valorCarga);
        contratacaoAerea.contratarFrete("Empresa Beta S.A.", valorCarga);
        contratacaoMaritima.contratarFrete("Empresa Gama Log", valorCarga);
    }
}