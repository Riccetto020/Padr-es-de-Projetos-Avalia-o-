import java.util.Arrays;
import java.util.List;

public class FreteMaritimo extends Frete {

    public FreteMaritimo(double valorCarga) {
        super("Marítimo", valorCarga);
    }
    @Override
    public double calcularValorFrete() {
        return getValorCarga() * 0.01;
    }
    @Override
    public List<String> getDocumentosExigidos() {
        return Arrays.asList("BL (Bill of Lading)", "Fatura Comercial");
    }
}