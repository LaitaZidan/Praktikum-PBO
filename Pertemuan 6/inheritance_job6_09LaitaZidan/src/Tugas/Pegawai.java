package Tugas;

public class Pegawai{
    protected String nip, nama, alamat;
    Dosen ds ;

    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public int getGaji() {
        return ds.TARIF_SKS*ds.jumlahSKS;
    }
    
    
}
