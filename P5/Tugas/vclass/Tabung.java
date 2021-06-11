package P5.Tugas.vclass;

import java.util.Scanner;

public class Tabung {
    private final float PI = (float) 3.14;
    private float radius, prisma;
    Scanner sc = new Scanner(System.in);

    public Tabung() {
        System.out.println("[Program untuk Menghitung Luas Lingkaran dan Volume Tabung]");
        System.out.println("[Untuk menghentikan Program, Ketik Q]");
        System.out.println("Masukkan radius dari Lingkaran");
        radius = sc.nextFloat();
        System.out.println("Masukkan tinggi prisma");
        prisma = sc.nextFloat();
    }

    public Tabung(float radius, float prisma) {
        this.radius = radius;
        this.prisma  = prisma;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getPrisma() {
        return prisma;
    }

    public void setPrisma(float prisma) {
        this.prisma = prisma;
    }

    public float getLuas() {
        return radius*radius*PI;
    }

    public float getVolume() {
        return radius*radius*PI*prisma;
    }

    @Override
    public String toString() {
        return "\nProfile: \n" + "Radius\t= " + getRadius() + "\nTinggi Prisma\t= " + getPrisma();
    }

}
