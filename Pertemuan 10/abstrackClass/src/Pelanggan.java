public class Pelanggan extends Orang{
    
    private int saldo;

    public Pelanggan(String nm, String almt) {
        super(nm, almt);
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo(){
        return saldo;
    }

    public void cetakInfo(){
        System.out.println("======Pelanggan======");
        System.out.println("Nama    : " + super.nama);
        System.out.println("ALamat  : " + super.alamat);
        System.out.println("Saldo   : " +getSaldo());
    }

    
}
