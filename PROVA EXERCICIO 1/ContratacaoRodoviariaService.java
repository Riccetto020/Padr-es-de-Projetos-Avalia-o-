public class ContratacaoRodoviariaService extends ContratacaoService {
    @Override
    protected Frete criarFrete(double valorCarga) {
        return new FreteRodoviario(valorCarga);
    }
}