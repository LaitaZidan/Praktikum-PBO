package src.Zidan_2141762100;
final class KomputerCetak {
    final void cetak(Komputer[] obj){

        for (int i = 0; i < obj.length; i++){
            System.out.println("================================");
            obj[i].hidupkan_os();
            obj[i].tekan_enter();
            obj[i].klik_kanan();
            obj[i].klik_kiri();
            obj[i].cetak_data();
            obj[i].matikan_os();
            System.out.println();
        }
        
        
    }

    public static void main(String[] args) {
        KomputerCetak komputerCetak =  new KomputerCetak();
        Komputer laptop = new Laptop();
        Komputer pc = new PC();
        Komputer netbook = new Netbook();
        Komputer temp[] = {laptop, pc, netbook};
        komputerCetak.cetak(temp);
        
    }
    
}
