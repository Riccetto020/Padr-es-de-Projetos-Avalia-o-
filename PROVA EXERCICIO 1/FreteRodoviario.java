import java.util.Arrays;
import java.util.List;

public class FreteRodoviario extends Frete {

    public FreteRodoviario(double valorCarga) {
        super("Rodoviário", valorCarga);
    }

    @Override
    public double calcularValorFrete() {
        return getValorCarga() * 0.02;
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return Arrays.asList("CT-e", "MDF-e");
    }
}