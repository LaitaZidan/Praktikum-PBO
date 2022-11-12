package Tugas;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DaftarGaji{
    
    protected Pegawai[] listPegawai;

    public DaftarGaji(int gj) {

      
    }

    public void addPegawai(Pegawai[] pg){
        listPegawai = pg;
    }
    
    public void printSemuaGaji(){

        for(int i = 0; i < listPegawai.length; i++){
            System.out.print("Nama: " +listPegawai[i].nama);
          }
          System.out.println();
       
    }
}
