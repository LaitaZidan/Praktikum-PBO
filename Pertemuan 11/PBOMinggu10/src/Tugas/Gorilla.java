package Tugas;

public class Gorilla extends Binatang implements IKarnivora, IHerbivora {
    private String suara;
    private String warnaBulu;

    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
       System.out.println("Jenis\t\t: Karnivora + Herbivora");
        
    }

    @Override
    public void displayBinatang(){
        System.out.println("Makanan\t\t: Daging + Tumbuhan");
    }

    public void displayData(){
        System.out.println("Nama\t\t: "+super.nama);
        System.out.println("Jumlah Kaki\t: "+super.jmlKaki);
        System.out.println("Suara\t\t: "+this.suara);
        System.out.println("Warna Bulu\t: "+this.warnaBulu);
        System.out.println();
    }
}
