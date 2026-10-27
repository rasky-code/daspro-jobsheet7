
import java.util.Scanner;

public class SiakadFor15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        // Membandingkan nilai untuk mencari nilai tertinggi dan terendah
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            // Menentukan nilai tertinggi
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            // Menentukan nilai terendah
            if (nilai < terendah) {
                terendah = nilai;
            }

            // Menghitung jumlah mahasiswa yang lulus dan tidak lulus
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        // Menampilkan hasil pengolahan nilai
        System.out.println("\n=== Hasil Pengolahan Nilai Mahasiswa ===");
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);

        sc.close();
    }
}
