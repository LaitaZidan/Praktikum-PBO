public class Karyawan extends Orang{

    private int gaji;

    public Karyawan(String nm, String almt){
        super(nm, almt);
    }


    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getGaji(){
        return gaji;
    }

    public void cetakInfo(){
        System.out.println("======Karyawan======");
        System.out.println("Nama    : " + super.nama);
        System.out.println("ALamat  : " +super.alamat);
        System.out.println("Gaji    : " +getGaji());
    }

  
}
