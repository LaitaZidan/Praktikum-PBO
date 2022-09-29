public class Pegawai {
    private String Nama, NIP;
    private Double gajiPokok ; 
    private double lembur;
    private double uangMakan, transport ;
    private int jumlahJamKerja;
    private double totalGaji;

    Pegawai(String nip, String nm){
        this.NIP = nip;
        this.Nama = nm;
    }

    // Getter
    public String getNama(){
        return Nama;
    }

    public String getNIP(){
        return NIP;
    }

    // Setter
    public void setJamKerja(int jamKerja){
        jumlahJamKerja = jamKerja;
    }

    public void hitungGajiHarian(){

        int jamLembur = jumlahJamKerja - 7;
        int jamKerjaPerhari = 7;
        gajiPokok  = 2000.0;
        lembur = 1.5*(gajiPokok*jamLembur);

        if(jumlahJamKerja >= 9){
            transport = 4000;
            uangMakan = 3500.0;
            totalGaji += (gajiPokok*jamKerjaPerhari) + transport +uangMakan + lembur;
        }else if (jumlahJamKerja >= 8){
            transport = 0;
            uangMakan = 3500.0;
            totalGaji += (gajiPokok*jamKerjaPerhari) + uangMakan + lembur;
        }else{
            transport = 0;
            uangMakan = 0;
            totalGaji += gajiPokok*jamKerjaPerhari;
        }
        
    }

    public void cetakPenghasilan(){
        System.out.println("=======================================");
        System.out.println("NIP             : " +getNIP());
        System.out.println("Nama            : " +getNama());
        System.out.println("Gaji pokok      : " +gajiPokok);
        System.out.println("Lembur          : " +lembur);
        System.out.println("Uang Makan      : " +uangMakan);
        System.out.println("Transport Lembur: " +transport);
        System.out.println("Take Home Pay   : " +totalGaji);
    }


}
