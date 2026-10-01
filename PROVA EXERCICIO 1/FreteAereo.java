import java.util.Arrays;
import java.util.List;

public class FreteAereo extends Frete {

    public FreteAereo(double valorCarga) {
        super("Aereo", valorCarga);
    }
    @Override
    public double calcularValorFrete() {
        return getValorCarga() * 0.06;
    }
    @Override
    public List<String> getDocumentosExigidos() {
        return Arrays.asList("AWB (Air Waybill)");
    }
}