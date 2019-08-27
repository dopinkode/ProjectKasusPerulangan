package dopinkode.id.dev;

import dopinkode.id.dev.menu.ProgramUtama;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) throws IOException {
	    // Todo 1.1: Deklarasi Variable & Konstanta
        int pilih_program;
        boolean perulangan = true;
        String jawaban;

        // Todo 2.2: Deklarasi Akses ke Class Lain
        ProgramUtama clsProgramUtama = new ProgramUtama();

        // Todo 2.1: Input
        Scanner scan_bacamasukan = new Scanner(System.in);
        BufferedReader read_bacamasukan = new BufferedReader(new InputStreamReader(System.in));

        while (perulangan) {
            clsProgramUtama.program_utama();

            System.out.print("Pilih Program [0-3]: ");
            pilih_program = scan_bacamasukan.nextInt();
            System.out.print("========================================\n\n");

            clsProgramUtama.function_pilihprogram(pilih_program);

            System.out.println("\nApa anda mau mengulang program utama? : ");
            System.out.println("Tekan [Y] untuk Mengulang dan [T] untuk");
            System.out.print("Berhenti dari Program: ");
            jawaban = read_bacamasukan.readLine();

            if (jawaban.equalsIgnoreCase("t")) {
                perulangan = false;
            }

            System.out.println();
        }
        System.out.println("Anda sudah keluar dari program utama.");

    }
}
