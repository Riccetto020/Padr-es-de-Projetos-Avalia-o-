public class Main {
    public static void main(String[] args) {
    
        AssinaturaFactory brasilFactory = new BrasilAssinaturaFactory();
        AssinaturaFactory mexicoFactory = new MexicoAssinaturaFactory();

        Assinatura assinaturaBrasil = new Assinatura(brasilFactory);
        assinaturaBrasil.ativar();

        Assinatura assinaturaMexico = new Assinatura(mexicoFactory);
        assinaturaMexico.ativar();
    }
}