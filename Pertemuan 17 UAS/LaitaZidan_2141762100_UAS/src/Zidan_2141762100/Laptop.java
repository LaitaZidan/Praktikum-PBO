package src.Zidan_2141762100;

public class Laptop extends Komputer implements Mouse, Keyboard, Printer{

    @Override
    public void hidupkan_os() {
        System.out.println("Laptop telah hidup");
    }

    @Override
    public void matikan_os() {
        System.out.println("Laptop telah mati");
        
    }

    @Override
    public void klik_kanan() {
       System.out.println("untuk mencetak data klik kanan mouse lalu pilih print");
        
    }

    @Override
    public void klik_kiri() {
        System.out.println("kemudian klik kiri mouse");
        
    }

    @Override
    public void tekan_enter(){
        System.out.println("tekan enter pada keyboard untuk membukanya");
    }
    
    @Override
    public void cetak_data(){
        System.out.println("printer sedang mencetak data dari Laptop");
    }

}
