package luasBangunDatar;

public class persegiPanjang extends bangunDatar{

    protected int pjg, lebar;

    

    public persegiPanjang() {
    }

    public persegiPanjang(int pjg, int lebar) {
        this.pjg = pjg;
        this.lebar = lebar;
    }
    
    public int luasPersegiPanjang(){
        return pjg*lebar;
    }

    public int kelilingPersegiPanjang(){
        return 2 * (pjg+lebar);
    }

    public int getPjg() {
        return pjg;
    }

    public void setPjg(int pjg) {
        this.pjg = pjg;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    
}
