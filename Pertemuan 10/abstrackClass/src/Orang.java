public abstract class Orang {
    
    protected String nama, alamat;

    public Orang(String nm, String almt){
        this.nama = nm;
        this.alamat =  almt;
    }

    public abstract void cetakInfo();
}
