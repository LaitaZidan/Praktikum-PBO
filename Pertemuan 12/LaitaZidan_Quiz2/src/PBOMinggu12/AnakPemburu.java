
package PBOMinggu12;

public class AnakPemburu extends Pemburu implements IMengambilTelur {
    
    @Override
    public void mengambilTelur(Dinosaurus dino) {
        dino.makan();
        System.out.println(" dengan cara mengambil telur mangsa nya");
        
    }
    
    @Override
    public void berburu(TyrannosaurusRex trex) {
        super.berburu(trex);
    }

    
}
