package Interface_LaitaZidan_09;
public class Ular implements InterfaceAnimal, InterfaceBehaviour{
    @Override
    public void animalSound() {
       System.out.println("Bunyi Ular: sssttt..");
        
    }

    @Override
    public void jenisAnimal() {
        System.out.println("Termasuk hewan Ovipar");
        
    }

    @Override
    public void makan() {
        System.out.println("Ular memangsa hewan bertubuh kecil");
        
    }

    @Override
    public void run() {
        System.out.println("Ular berjalan dengan perut");
        
    }
}
