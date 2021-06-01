import java.util.Scanner;

public class luasvolumesegitiga  {
    public static void main(String args[]){
        int tinggi, alas, prisma, luas, volume;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan alas dari segitiga");
        alas = sc.nextInt();
        System.out.println("Masukkan tinggi dari segitiga");
        tinggi = sc.nextInt();
        System.out.println("Masukkan tinggi prisma");
        prisma = sc.nextInt();
        luas = (alas*tinggi)/2;
        volume = ((alas*tinggi)/2)*prisma;
        System.out.println("Luas dari Segitiga = "+luas);
        System.out.println("Volume dari Segitiga = "+volume);
    }
}