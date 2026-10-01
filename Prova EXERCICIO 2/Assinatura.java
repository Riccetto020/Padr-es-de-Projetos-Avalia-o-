public class Assinatura {
    private final ComprovanteFiscal comprovanteFiscal;
    private final Pagamento pagamento;
    private final TermoPrivacidade termoPrivacidade;

    public Assinatura(AssinaturaFactory factory) {
     
        this.comprovanteFiscal = factory.criarComprovanteFiscal();
        this.pagamento = factory.criarPagamento();
        this.termoPrivacidade = factory.criarTermoPrivacidade();
    }

    public void ativar() {
    
        System.out.println("----ATIVAÇÃO DE ASSINATURA----");
        System.out.println(comprovanteFiscal.getDescricao());
        System.out.println(pagamento.getDescricao());
        System.out.println(termoPrivacidade.getDescricao());
        System.out.println();
    }
}