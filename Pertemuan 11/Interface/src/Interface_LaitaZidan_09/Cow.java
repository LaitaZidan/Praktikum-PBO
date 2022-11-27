package Interface_LaitaZidan_09;
public class Cow implements InterfaceAnimal, InterfaceBehaviour{
    
    @Override
    public void animalSound() {
       System.out.println("Bunyi Sapi: moo..");
        
    }

    @Override
    public void jenisAnimal() {
        System.out.println("Termasuk hewan Mamalia");
        
    }
  

    @Override
    public void makan() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }

    public void sleep(){
        System.out.println("Sapi tidur sambil berdiri");
    }
}
