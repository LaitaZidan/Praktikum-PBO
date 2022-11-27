package Tugas;

public class TugasMain {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("Kedelai", 4, "Hehehe", "Abu-Abu");
        Gorilla gorilla = new Gorilla("Gulali", 4, "Haaum Hauum", "Hitam Manis");
        Singa singa = new Singa("CingaCing", 4, "Roaaar", "Coklat");

        keledai.displayMakan();
        keledai.displayBinatang();
        keledai.displayData();

        gorilla.displayMakan();
        gorilla.displayBinatang();
        gorilla.displayData();

        singa.displayMakan();
        singa.displayBinatang();
        singa.displayData();
    }
    
}
