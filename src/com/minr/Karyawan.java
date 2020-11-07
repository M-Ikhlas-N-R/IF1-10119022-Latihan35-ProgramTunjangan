package com.minr;

public class Karyawan {
    // Deklarasi Variabel
    private double gajiPokok;
    private String status;

    public void setGajiPokok(double parGajiPokok) {
        this.gajiPokok = parGajiPokok;
    }

    public void setStatus(String parStatus) {
        this.status = parStatus.toLowerCase();
    }

    private double getGajiPokok() {
        return this.gajiPokok;
    }

    private String getStatus() {
        return this.status;
    }

    private double getTunjangan() {
        if (this.getStatus().equals("menikah")) return this.gajiPokok * 0.35;
        return 0;
    }

    private double getTotalGaji() {
        return this.gajiPokok + this.getTunjangan();
    }

    public void getResult() {
        System.out.println("\n======Hasil Perhitungan Gaji Anda======");
        System.out.println("Gaji Pokok\t\t: " + this.getGajiPokok());
        System.out.println("Tunjangan\t\t: " + this.getTunjangan());
        System.out.println("Total Gaji\t\t: " + this.getTotalGaji());
        System.out.println("(Developed by : M Ikhlas N R)");
    }

}
