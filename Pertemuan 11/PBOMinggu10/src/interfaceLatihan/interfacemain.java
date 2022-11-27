package interfaceLatihan;

import interfaceLatihan.Mahasiswa;
import interfaceLatihan.PascaSarjana;
import interfaceLatihan.Rektor;
import interfaceLatihan.Sarjana;

public class interfacemain {
    
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();
        

        Mahasiswa mhsBiasa = new Mahasiswa("Laita");
        Sarjana sarjanaCumlaude = new Sarjana("Zidan");
        PascaSarjana masteCumlaude = new PascaSarjana("Azizi");

        // pakrektor.bersertifikatCumlaude(mhsBiasa);
        pakrektor.bersertifikatCumlaude(sarjanaCumlaude);
        pakrektor.bersertifikatCumlaude(masteCumlaude);
        

    }
}





