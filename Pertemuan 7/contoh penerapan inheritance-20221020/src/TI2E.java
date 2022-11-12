public class TI2E extends matkul_PBO{

@Override

public void tampil()
{
System.out.println("Nama : "+nama);
System.out.println("NIM : "+nim);
}

public void nilai(){
System.out.println("Nilai Teori PBO : "+nilaiPBO_T);
System.out.println("Nilai Praktikum PBO : "+nilaiPBO_P);
System.out.println("Nilai Praktikum PBO : "+status);
System.out.println("=======================");
}
}