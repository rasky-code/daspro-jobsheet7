import java.util.Scanner;

public class Tugas2MenghitungTotalParkir15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenisKendaraan;
        int lamaParkir;
        int tarif;
        int totalBayar;
        int totalPendapatan = 0;

        while (true) {
            System.out.println("\n=== PARKIR ===");
            System.out.println("1. Mobil (Rp3000/jam)");
            System.out.println("2. Motor (Rp2000/jam)");
            System.out.println("0. Selesai");

            System.out.print("Masukkan jenis kendaraan: ");
            jenisKendaraan = sc.nextInt();

            if (jenisKendaraan == 0) {
                break;
            }

            if (jenisKendaraan == 1) {
                tarif = 3000;
            } else if (jenisKendaraan == 2) {
                tarif = 2000;
            } else {
                System.out.println("Jenis kendaraan tidak valid!");
                continue;
            }

            System.out.print("Masukkan lama parkir (jam): ");
            lamaParkir = sc.nextInt();

            if (lamaParkir <= 0) {
                System.out.println("Lama parkir tidak valid!");
                continue;
            }

            totalBayar = tarif * lamaParkir;
            totalPendapatan += totalBayar;

            System.out.println("Total pembayaran: Rp" + totalBayar);
        }

        System.out.println("\n=== REKAP PARKIR ===");
        System.out.println("Total pendapatan parkir: Rp" + totalPendapatan);

        sc.close();
    }
}