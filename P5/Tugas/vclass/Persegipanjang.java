package P5.Tugas.vclass;

import java.util.Scanner;

public class Persegipanjang {
    private float panjang, lebar, prisma;
    Scanner sc = new Scanner(System.in);

    public Persegipanjang() {
        System.out.println("[Program untuk Menghitung Luas Persegi Panjang dan Volume Balok]");
        System.out.println("[Untuk menghentikan Program, Ketik Q]");
        System.out.println("Masukkan panjang dari Persegi Panjang");
        panjang = sc.nextFloat();
        System.out.println("Masukkan lebar dari Persegi Panjang");
        lebar = sc.nextFloat();
        System.out.println("Masukkan tinggi Balok");
        prisma = sc.nextFloat();
    }

    public Persegipanjang(float panjang, float lebar, float prisma) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.prisma= prisma;
    }

    public float getPanjang() {
        return this.panjang;
    }
    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }
    public float getLebar() {
        return this.lebar;
    }
    public void setLebar(float lebar) {
        this.lebar = lebar;
    }
    public float getPrisma() {
        return this.prisma;
    }
    public void setPrisma(float prisma) {
        this.prisma = prisma;
    }

    public float getLuas() {
        return panjang*lebar;
    }

    public float getVolume() {
        return panjang*lebar*prisma;
    }

    @Override
    public String toString() {
        return "\nProfile: \n" + "Panjang\t= " + getPanjang() + "\nLebar\t= " + getLebar() + "\nTinggi Prisma\t= "
                + getPrisma();
    }

}
