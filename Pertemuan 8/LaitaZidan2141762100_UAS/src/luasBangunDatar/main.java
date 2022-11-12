package luasBangunDatar;

public class main {
    
    public static void main(String[] args) {
        
        
        bangunDatar b = new bangunDatar();
        b.l.p.setSisi(8);
        b.pj.setPjg(5);
        b.s.setAlas(6);
        b.s.setSisiA(5);
        b.s.setSisiB(5);
        b.s.setSisiC(5);

        b.printLIngkaran();
        b.printPersegi();
        b.printPersegiPanjang();
        b.printSegitiga();
        
        
    }

}
