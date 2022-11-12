package Tugas;



public class main {
    public static void main(String[] args) {
        
       

        
        Dosen ds = new Dosen("24456557611", "Zidan", "Maron");
        
        Pegawai [] pg1 = new Pegawai[1];
        pg1[0] = new Pegawai(ds.nip, ds.nama, ds.alamat);
        ds.setSKS(5);
        ds.setTARIF_SKS(20000);
        DaftarGaji dg = new DaftarGaji(ds.getGaji());
        dg.addPegawai(pg1);
        dg.printSemuaGaji(); 
        
    }
}
