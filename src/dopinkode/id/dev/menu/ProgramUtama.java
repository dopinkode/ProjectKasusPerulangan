package dopinkode.id.dev.menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ProgramUtama {

    public void program_utama() {
        System.out.println("========================================\n" +
                           "Pilih Program\n" +
                           "========================================\n" +
                           "1. Program Kalkulator\n" +
                           "2. Program Belanja dengan Diskon\n" +
                           "3. Program Pemesanan Menu\n" +
                           "========================================");
    }

    public void function_pilihprogram(int pilihan_menu) throws IOException {
        // Todo 1.2: Deklarasi Variable & Konstanta
        int operasi_pilih;
        int bil1, bil2;

        boolean perulangan = true;
        String jawaban;

        // Todo 1.3: Input
        Scanner scan_inputan = new Scanner(System.in);
        BufferedReader read_inputan = new BufferedReader(new InputStreamReader(System.in));

        if (pilihan_menu == 1) {
            while (perulangan) {
                System.out.println("----------------------------------------\n" +
                        "Anda Dalam Program: Kalkulator\n" +
                        "----------------------------------------");
                System.out.print("Masukan bilangan 1: ");
                bil1 = scan_inputan.nextInt();
                System.out.print("Masukan bilangan 2: ");
                bil2 = scan_inputan.nextInt();
                System.out.println("----------------------------------------\n" +
                        "Pilih Operasi Aritmetika\n" +
                        "----------------------------------------\n" +
                        "1. Penjumlahan\n" +
                        "2. Pengurangan\n" +
                        "3. Perkalian\n" +
                        "4. Pembagian\n" +
                        "5. Perpangkatan\n" +
                        "----------------------------------------");
                System.out.print("Masukan Pilihan [1-4]: ");
                operasi_pilih = scan_inputan.nextInt();

                // Todo 1.4: Pilih Proses
                function_pilihoperasi(operasi_pilih, bil1, bil2);

                System.out.println("Apa anda mau mengulang kalkulator? : ");
                System.out.println("Tekan [Y] untuk Mengulang dan [T] untuk");
                System.out.print("Berhenti dari Program: ");
                jawaban = read_inputan.readLine();

                if (jawaban.equalsIgnoreCase("t")) {
                    perulangan = false;
                }

                System.out.println();
            }
            System.out.println("----------------------------------------");
            System.out.println("Anda keluar dari Program Kalkulator");
            System.out.println("----------------------------------------");
        } else if (pilihan_menu == 2) {
            System.out.println("----------------------------------------\n" +
                               "Anda Dalam Program: Belanja + Diskon\n" +
                               "----------------------------------------");
        } else if (pilihan_menu == 3) {
            System.out.println("----------------------------------------\n" +
                               "Anda Dalam Program: Pemesanan Menu\n" +
                               "----------------------------------------");
        } else {
            System.out.println("Pilihan Program Tidak Tersedia! Mohon \nMasukan Pilihan dengan Benar.");
        }
    }

    public void function_pilihoperasi(int pilih_operator, int set_bil1, int set_bil2) {
        // Todo 1.1.1: Deklarasi Variable & Konstanta
        double hasil;

        if (pilih_operator == 1) {
            // Todo 1.1.2: Pilih Operasi & Proses Penjumlahan
            hasil = set_bil1 + set_bil2;
            System.out.println("----------------------------------------\n" +
                               "Hasil Penjumlahan Adalah: " + hasil);
            System.out.println("----------------------------------------\n");
        } else if (pilih_operator == 2) {
            // Todo 1.1.2: Pilih Operasi & Proses Pengurangan
            hasil = set_bil1 - set_bil2;
            System.out.println("----------------------------------------\n" +
                    "Hasil Pengurangan Adalah: " + hasil);
            System.out.println("----------------------------------------\n");
        }
    }
}
