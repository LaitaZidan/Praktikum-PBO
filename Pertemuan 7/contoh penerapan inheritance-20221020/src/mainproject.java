public class mainproject{
  
    public static void main(String[] args){
    matkul_PBO pbo = new matkul_PBO();
    TI2F ti2f = new TI2F();
    TI2E ti2e = new TI2E();
            
    ti2e.nama = "adam";
    ti2e.nim = 1;
    ti2e.nilaiPBO_T=90;
    ti2e.nilaiPBO_P=80;
    ti2e.statuskelulusan();
        
    ti2f.nama = "hawa";
    ti2f.nim = 2;
    ti2f.nilaiPBO_T=50;
    ti2f.nilaiPBO_P=45;
    ti2f.statuskelulusan();

    
    pbo.tampil();
    ti2e.tampil();
    ti2e.nilai();
    ti2f.tampil();
    ti2f.nilai();
   
    
    }
 
    }