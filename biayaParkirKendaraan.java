import java.util.Scanner;

public class biayaParkirKendaraan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasiParkir, biaya = 0, totalPembayaran = 0, jumlahKendaraan = 0;

        while (true) {
            System.out.println("Pilih jenis kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                System.out.println("Terima kasih telah menggunakan layanan parkir kami.");
                break;
            }

            System.out.println("Masukkan durasi parkir (dalam jam): ");
            durasiParkir = sc.nextInt();

            if (durasiParkir > 5) {
                biaya = 12500;
            } else if (jenis == 1) {
                biaya = 3000 * durasiParkir;
            } else if (jenis == 2) {
                biaya = 2000 * durasiParkir;
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
                continue;
            }

            if (jenis == 1) {
                System.out.println("Biaya parkir mobil selama " + durasiParkir + " jam adalah: Rp " + biaya);
            } else if (jenis == 2) {
                System.out.println("Biaya parkir motor selama " + durasiParkir + " jam adalah: Rp " + biaya);
            }
            totalPembayaran += biaya;
            jumlahKendaraan++;
        }
        System.out.println("Total kendaraan yang diparkir hari ini: " + jumlahKendaraan);
        System.out.println("Total pembayaran parkir hari ini: Rp " + totalPembayaran);

        sc.close();
    }
}