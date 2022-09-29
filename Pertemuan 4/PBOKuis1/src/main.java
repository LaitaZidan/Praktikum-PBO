import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIP              : ");
        String nip = input.nextLine();
        System.out.print("Masukkan Nama             : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Jumlah jam kerja : ");
        int jamKerja = input.nextInt();

        Pegawai pg = new Pegawai(nip, nama);
        pg.setJamKerja(jamKerja);
        pg.hitungGajiHarian();
        pg.cetakPenghasilan();

    }
}
