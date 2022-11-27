package interfaceLatihan;

public class MultipleInterfaceMain {
    
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();
        
        
        Sarjana sarjanaCum = new Sarjana("Laita");
        PascaSarjana masteCum = new PascaSarjana("Zidan");

        pakrektor.beriSertifikatMawapres(sarjanaCum);
        pakrektor.beriSertifikatMawapres(masteCum);
    }
}
