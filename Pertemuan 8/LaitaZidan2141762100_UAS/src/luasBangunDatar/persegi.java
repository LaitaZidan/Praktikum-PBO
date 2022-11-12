package luasBangunDatar;

public class persegi extends bangunDatar{
    
    protected int sisi;


    public int luasPersegi(){
        return sisi*sisi;
    }

    public int kelilingPersegi(){
        return 4*sisi;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    
    
}
