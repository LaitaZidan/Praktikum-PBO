package PBO_Minggu10;

public class Program {
    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing();
        Ikan lumbaLumba = new Ikan();

        Orang laita = new Orang("Laita");
        Orang zidan = new Orang("Zidan");

        laita.peliharaanHewan(kucingKampung);
        zidan.peliharaanHewan(lumbaLumba);

        laita.ajakPeliharaanJalanJalan();
        zidan.ajakPeliharaanJalanJalan();
    }
}
