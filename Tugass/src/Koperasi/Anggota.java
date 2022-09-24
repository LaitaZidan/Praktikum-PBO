package Koperasi;

public class Anggota {

        private String noKtp;
        private String nama;
        private int limitPinjaman;
        private int jumlahPinjaman;
    
    Anggota(String noKtp, String nama, int limitPinjaman){
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    } 

    public void setNoktp(String noKtp){
        this.noKtp = noKtp;
    }

    public void setNama(String nama){
        this.nama=nama;
    } 

    public String getNoktp(){
        return noKtp;
    }

    public String getNama(){
        return nama;
    }

    public int getLimitPinjaman(){
        return limitPinjaman;
    }

    public void setLimit(int newlimitPinjaman){
        if(newlimitPinjaman > limitPinjaman){
            limitPinjaman = newlimitPinjaman;
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }else{
            limitPinjaman = newlimitPinjaman;   
        }
    }

    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }

    public void pinjam(int pinjaman){
        if(pinjaman < limitPinjaman){
            jumlahPinjaman += pinjaman;
        }else{
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
    }

    public void angsur(int angsuran){
        if(jumlahPinjaman >= angsuran){
            if(angsuran >= (jumlahPinjaman*0.1)){
                jumlahPinjaman -= angsuran;
            }else{
                System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
            }
        }else{
        System.out.println(nama + " tidak memiliki pinjaman.");  
        }
    }

}

