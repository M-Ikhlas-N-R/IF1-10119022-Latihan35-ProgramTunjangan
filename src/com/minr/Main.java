package com.minr;

import java.util.Scanner;

public class Main extends Karyawan{
    private double gajiPokokKaryawan;
    private String statusKaryawan;

    public static void main(String[] args) {
        // Membuat instance baru
        Main karyawan1 = new Main();
        Scanner userInput = new Scanner(System.in);

        // masukkan Gaji Pokok dan Status karyawan
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        karyawan1.gajiPokokKaryawan = userInput.nextDouble();
        System.out.print("Status Anda ? (Menikah/Belum)\t: ");
        karyawan1.statusKaryawan = userInput.next();

        // menjalankan Procedure dan Method
        karyawan1.setGajiPokok(karyawan1.gajiPokokKaryawan);
        karyawan1.setStatus(karyawan1.statusKaryawan);
        karyawan1.getResult();

    }
}
