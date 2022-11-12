package luasBangunDatar;

public class segitiga extends bangunDatar{
 
    protected int alas, tinggi, sisiA, sisiB, sisiC;

    

    public segitiga() {
    }

    public segitiga(int alas, int tinggi, int sisiA, int sisiB, int sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    public double luasSetiga(){
        return 0.5 * alas*tinggi;
    }

    public double kelilingSegitiga(){
        return sisiA+sisiB+sisiC;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getSisiA() {
        return sisiA;
    }

    public void setSisiA(int sisiA) {
        this.sisiA = sisiA;
    }

    public int getSisiB() {
        return sisiB;
    }

    public void setSisiB(int sisiB) {
        this.sisiB = sisiB;
    }

    public int getSisiC() {
        return sisiC;
    }

    public void setSisiC(int sisiC) {
        this.sisiC = sisiC;
    }
}
