public class ContratacaoAereaService extends ContratacaoService {
    @Override
    protected Frete criarFrete(double valorCarga) {
        return new FreteAereo(valorCarga);
    }
}