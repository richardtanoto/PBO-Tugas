package P5.Tugas.vclass;

import java.util.Scanner;

public class segitiga {
    private float alas, tinggi, prisma;
    Scanner sc = new Scanner(System.in);

    public segitiga() {
        System.out.println("[Program untuk Menghitung Luas Segitiga dan Volume Prisma Segitiga]");
        System.out.println("[Untuk menghentikan Program, Ketik Q]");
        System.out.println("Masukkan alas dari segitiga");
        alas = sc.nextFloat();
        System.out.println("Masukkan tinggi dari segitiga");
        tinggi = sc.nextFloat();
        System.out.println("Masukkan tinggi prisma");
        prisma = sc.nextFloat();
    }

    public segitiga(float alas, float tinggi, float prisma) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.prisma= prisma;
    }

    public float getAlas() {
        return this.alas;
    }
    public void setAlas(float alas) {
        this.alas = alas;
    }
    public float getTinggi() {
        return this.tinggi;
    }
    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }
    public float getPrisma() {
        return this.prisma;
    }
    public void setPrisma(float prisma) {
        this.prisma = prisma;
    }

    public float getLuas() {
        return (alas*tinggi)/2;
    }

    public float getVolume() {
        return ((alas*tinggi)/2)*prisma;
    }

    @Override
    public String toString() {
        return "\nProfile: \n" + "Alas\t= " + getAlas() + "\nTinggi Segitiga\t= " + getTinggi() + "\nTinggi Prisma\t= "
                + getPrisma();
    }

}
