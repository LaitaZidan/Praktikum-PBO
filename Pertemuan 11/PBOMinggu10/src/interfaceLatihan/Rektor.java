package interfaceLatihan;

public class Rektor {
    
    public void bersertifikatCumlaude(ICumlaude mahasiswa){
       
        System.out.println("Saya Rektor, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri anda.");
        
        mahasiswa.kuliahDiKampus();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("-------------------------------------------------");
    }

    public void beriSertifikatMawapres(IBerprestasi mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana anda bisa berprestasi?");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("-------------------------------------------------");
        
    }
    
}
