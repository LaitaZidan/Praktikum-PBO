package LaitaZidan_relasiclass_percobaan1;

public class MainPercobaan1 {
    public static void main(String[] args) {

        Processor p = new Processor("Intel i5", 3);

        Laptop L = new Laptop("Thinkpad", p);

        L.info();

        Processor pl = new Processor();
        pl.setMerk("Intel i5");
        pl.setCache(4);

        Laptop Ll = new Laptop();
        Ll.setMerk("Thinkpad");
        Ll.setProc(pl);
        Ll.info();
    }
}
