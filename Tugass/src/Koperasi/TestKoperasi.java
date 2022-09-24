package Koperasi;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args){
        Anggota Zidan = new Anggota("111333444", "Zidan", 5000000);
    
        System.out.println("Nama Anggota: " + Zidan.getNama());
        System.out.println("Limit Pinjaman: " + Zidan.getLimitPinjaman());

        System.out.println("\nMeminjam uang 10.000.000...");
        Zidan.pinjam(10000000);

        System.out.println("\nMeminjam uang 4.000.000...");
        Zidan.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + Zidan.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 1.000.000");
        Zidan.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + Zidan.getJumlahPinjaman());

        /*5. Modifikasi soal no. 4 agar nominal yang dapat diangsur minimal adalah 10% dari jumlah 
        pinjaman saat ini. Jika mengangsur kurang dari itu, maka muncul peringatan “Maaf, 
        angsuran harus 10% dari jumlah pinjaman”*/

        // 10% dari 3000.000 = 300.000
        System.out.println("\n----Output soal nomer 5----");
        System.out.println("Membayar angsuran 200.000");
        Zidan.angsur(200000);
        System.out.println("Jumlah pinjaman saat ini: " + Zidan.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 3.000.000");
        Zidan.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + Zidan.getJumlahPinjaman());


        // 6. Modifikasi class TestKoperasi, agar jumlah pinjaman dan angsuran dapat menerima input dari console.
        Scanner input = new Scanner(System.in);
        int uang;

        System.out.println("\n----Output soal nomer 6----");
        System.out.println("Nama Anggota\t\t: " + Zidan.getNama());
        System.out.println("Limit Pinjaman\t\t: " + Zidan.getLimitPinjaman());

        System.out.print("\nJumlah pinjam uang: Rp.");
        uang = input.nextInt(); 
        Zidan.pinjam(uang);
        System.out.println("Jumlah Pinjaman saat ini: Rp." + Zidan.getJumlahPinjaman());
        
        System.out.print("\nBayar angsuran: Rp.");
        uang = input.nextInt(); 
        Zidan.angsur(uang);
        System.out.println("Jumlah Pinjaman saat ini: Rp." + Zidan.getJumlahPinjaman());
        
        System.out.print("\nBayar angsuran: Rp.");
        uang = input.nextInt(); 
        Zidan.angsur(uang);
        System.out.println("Jumlah Pinjaman saat ini: Rp." + Zidan.getJumlahPinjaman());


    }
}







