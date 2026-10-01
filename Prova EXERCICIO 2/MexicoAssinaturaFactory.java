public class MexicoAssinaturaFactory implements AssinaturaFactory {
    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new CfdiComprovante();
    }
    @Override
    public Pagamento criarPagamento() {
        return new SpeiPagamento();
    }
    @Override
    public TermoPrivacidade criarTermoPrivacidade() {
        return new LfpdpppTermo();
    }
}
