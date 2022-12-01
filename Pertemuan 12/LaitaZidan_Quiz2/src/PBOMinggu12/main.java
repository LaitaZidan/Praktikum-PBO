package PBOMinggu12;

public class main {
    public static void main(String[] args) {

        AnakPemburu ap = new AnakPemburu();
        Oviraptor oviraptor =  new Oviraptor();
        TyrannosaurusRex trex = new TyrannosaurusRex();
        Triceratops triceratops = new Triceratops();

        ap.mengambilTelur(oviraptor);
        oviraptor.berjalan();
        oviraptor.bertelur();
        System.out.println();

        ap.berburu(trex);
        trex.berjalan();
        System.out.println();

        triceratops.makan();
        triceratops.berjalan();
        System.out.println();
        
    }
}
