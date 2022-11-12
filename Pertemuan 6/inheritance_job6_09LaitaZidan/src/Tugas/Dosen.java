package Tugas;

public class Dosen extends Pegawai{
    
    protected int jumlahSKS, TARIF_SKS;

    

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
        super.nip = nip;
        super.nama = nama;
        super.alamat = alamat;
    }

    public void setSKS(int jmlsks) {
        this.jumlahSKS = jmlsks;
    }

    public void setTARIF_SKS(int tarif) {
        this.TARIF_SKS = tarif;
    }

    public int getGaji() {
        return jumlahSKS*TARIF_SKS;
    }
    
}
