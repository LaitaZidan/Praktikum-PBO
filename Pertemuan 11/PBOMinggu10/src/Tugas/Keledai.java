package Tugas;

public class Keledai extends Binatang implements IHerbivora {
    private String suara;
    private String warnaBulu;

    public Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Makanan\t\t: Tumbuhan");
        
    }

    @Override
    public void displayMakan() {
       System.out.println("Jenis\t\t: Herbivora");
        
    }

    public void displayData(){
        System.out.println("Nama\t\t: "+super.nama);
        System.out.println("Jumlah Kaki\t: "+super.jmlKaki);
        System.out.println("Suara\t\t: "+this.suara);
        System.out.println("Warna Bulu\t: "+this.warnaBulu);
        System.out.println();
    }
    
}
