public class main {
    
    public static void main(String[] args) {

        Karyawan k = new Karyawan("Laita Zidan", "Kota Malang");
        Pelanggan p = new Pelanggan("Laita Zidan", "Kota Malang");
        k.setGaji(15000000);
        k.cetakInfo();
        p.setSaldo(15000000);
        p.cetakInfo();
        

    }
}
