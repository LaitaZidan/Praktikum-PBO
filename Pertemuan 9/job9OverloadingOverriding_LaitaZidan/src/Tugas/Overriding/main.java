package Tugas.Overriding;

public class main {
    
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        Dosen d = new Dosen();
        Manusia m = new Manusia();
        
        m.bernafas();
        m.makan();
        
        System.out.println("");
        
        d.bernafas();
        d.makan();
        d.lembur();
        
        System.out.println("");
        
        mhs.bernafas();
        mhs.makan();
        mhs.tidur();
       
        
    }
}
