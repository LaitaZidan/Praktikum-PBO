package PBOMinggu12;

public class Oviraptor extends Dinosaurus implements IBertelur{

    @Override
    public void berjalan() {
        System.out.println("Oviraptor: berjalan dengan 2 kaki");
        
    }

    @Override
    public void makan() {
        System.out.print("Oviraptor: memakan telur" );
        
    }

    @Override
    public void bertelur() {
        System.out.println("Oviraptor: berkembang biak dengan cara bertelur");
    }
    
}
