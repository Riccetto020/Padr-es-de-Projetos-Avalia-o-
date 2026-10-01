public class BrasilAssinaturaFactory implements AssinaturaFactory {
    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new NfseComprovante();
    }
    @Override
    public Pagamento criarPagamento() {
        return new PixPagamento();
    }
    @Override
    public TermoPrivacidade criarTermoPrivacidade() {
        return new LgpdTermo();
    }
}