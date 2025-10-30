import java.util.Scanner;

public class totalPenjualanTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int tiket = 0, hargaTiket = 50000, i = 0, totalPenjualanTiketPerHari = 0;
    double lebihEmpatTiket = 0.1, lebihSepuluhTiket = 0.15;
    double totalPendapatan = 0.0; 

       while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
              tiket = sc.nextInt();

            if (tiket < 0) {
                  break;
            }

            double totalHarga = tiket * hargaTiket;

            if (tiket > 10) {
                  totalHarga = totalHarga - (totalHarga * lebihSepuluhTiket);
            } else if (tiket > 4) {
                  totalHarga = totalHarga - (totalHarga * lebihEmpatTiket);
            }

            System.out.println("Total harga yang harus dibayar: " + totalHarga);

            totalPenjualanTiketPerHari += tiket;     
            totalPendapatan += totalHarga;             

            i++; 
        }
        System.out.println("Total tiket terjual hari ini: " + totalPenjualanTiketPerHari);
        System.out.println("Total pendapatan hari ini: " + totalPendapatan);

        sc.close();
    }
}