package koperasigettersetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Laita Zidan","Jalan Candi 2 Karangbesuki Sukun");
        System.out.println("Simpanan "+ anggota1.getNama()+" : Rp "+ anggota1.getSimpanan());
        
        anggota1.setNama("Laita Zidan");
        anggota1.setAlamat("Jalan Candi 2 Karangbesuki Sukun");
        anggota1.setor(100000);
        System.out.println("Simpanan "+ anggota1.getNama()+" : Rp "+ anggota1.getSimpanan());
        
        anggota1.pinjam(50000);
        System.out.println("Simpanan "+anggota1.getNama()+" : Rp "+ anggota1.getSimpanan());
    }
}
