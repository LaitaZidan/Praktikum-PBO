package luasBangunDatar;

public class bangunDatar {

    protected double phi;
    protected int jariJari;

    lingkaran l = new lingkaran(0);
    segitiga s = new segitiga();
    persegiPanjang pj = new persegiPanjang(); 
    
    public bangunDatar() {
        
    }

    public void printPersegi(){
        System.out.println("Luas Persegi = "+ l.p.luasPersegi());
        System.out.println("Keliling Persegi = "+ l.p.kelilingPersegi());
    }

    public void printLIngkaran(){
        System.out.println("Luas Lingkaran = "+l.luasLingkaran() );
        System.out.println("Keliling LIngkaran = "+ l.kelilingLingkaran());
    }

    public void printSegitiga(){
        System.out.println("Luas Segitiga = "+ s.luasSetiga());
        System.out.println("Keliling Segitiga = "+ s.kelilingSegitiga());
    }

    public void printPersegiPanjang(){
        System.out.println("Luas Persegi Panjang= "+ pj.luasPersegiPanjang());
        System.out.println("Keliling Persegi Panjang = "+ pj.kelilingPersegiPanjang());
    }

}
