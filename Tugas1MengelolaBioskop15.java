import java.util.Scanner;

public class Tugas1MengelolaBioskop15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        int totalTiket = 0;
        int hargaTiket = 50000;

        double totalPenjualan = 0;
        double subtotal;
        double diskon;
        double totalBayar;

        boolean selesai;

        do {
            System.out.print("Masukkan jumlah tiket: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid!");
                continue;
            }

            if (jumlahTiket == 0) {
                System.out.println("Jumlah tiket harus lebih dari 0!");
                continue;
            }

            subtotal = jumlahTiket * hargaTiket;
            diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15 * subtotal;
            } else if (jumlahTiket > 4) {
                diskon = 0.10 * subtotal;
            }

            totalBayar = subtotal - diskon;

            totalTiket += jumlahTiket;
            totalPenjualan += totalBayar;

            System.out.println("Subtotal: Rp" + subtotal);
            System.out.println("Diskon: Rp" + diskon);
            System.out.println("Total bayar: Rp" + totalBayar);

            System.out.print("Apakah transaksi sudah selesai? (ya/tidak): ");
            selesai = sc.next().equalsIgnoreCase("ya");
            if (selesai) {
                break;
            }
            
        } while (true);

        System.out.println("\n=== REKAP PENJUALAN BIOSKOP ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp" + totalPenjualan);

        sc.close();
    }
}