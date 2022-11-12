package luasBangunDatar;

public class lingkaran extends bangunDatar{
    
    protected double phi;
    protected int jariJari;

    persegi p = new persegi();

    public lingkaran(int jariJari) {
        this.jariJari = jariJari;
    }

    public double luasLingkaran(){
        if(jariJari%2 == 0){
            this.phi = 3.14;
        }else{
            this.phi = 22/7;
        }
        return phi*jariJari*jariJari;
    }

    public double kelilingLingkaran(){
        this.phi = 22/7;
        return 2*phi*jariJari;
    }

    public double getPhi() {
        return phi;
    }
    public void setPhi(float phi) {
        this.phi = phi;
    }
    public int getJariJari() {
        return jariJari;
    }
    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }

    
}
