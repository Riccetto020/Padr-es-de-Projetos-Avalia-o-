public abstract class ContratacaoService {

    protected abstract Frete criarFrete(double valorCarga);

    public void contratarFrete(String nomeCliente, double valorCarga) {
        Frete frete = criarFrete(valorCarga);
        double valorFrete = frete.calcularValorFrete();

        System.out.println("------RESUMO DA CONTRATAÇÃO------");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Modalidade: " + frete.getModalidade());
        System.out.printf("Valor da Carga: R$ %.2f%n", valorCarga);
        System.out.printf("Valor do Frete: R$ %.2f%n", valorFrete);
        System.out.println("Documentos Exigidos: " + String.join(", ", frete.getDocumentosExigidos()));
        System.out.println();
    }
}