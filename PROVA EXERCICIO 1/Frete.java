import java.util.List;

public abstract class Frete {
    private String modalidade;
    private double valorCarga;

    public Frete(String modalidade, double valorCarga) {
        this.modalidade = modalidade;
        this.valorCarga = valorCarga;
    }

    public String getModalidade() {
        return modalidade;
    }

    public double getValorCarga() {
        return valorCarga;
    }

    public abstract double calcularValorFrete();
    public abstract List<String> getDocumentosExigidos();
}