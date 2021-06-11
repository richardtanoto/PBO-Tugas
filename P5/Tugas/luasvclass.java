package P5.Tugas;

import java.util.Scanner;

import P5.Tugas.vclass.*;

public class luasvclass {
    public static void main(String[] args) throws Exception {
        String letter = "";
        int option;
        Scanner sc= new Scanner(System.in);

        do {
            System.out.println("Menu: ");
            System.out.println("1) Program untuk Menghitung Luas Persegi Panjang dan Volume Balok");
            System.out.println("2) Program untuk Menghitung Luas Segitiga dan Volume Prisma Segitiga");
            System.out.println("3) Program untuk Menghitung Luas Lingkaran dan Volume Tabung");
            System.out.println("4) Exit");
            System.out.print("Pilih : ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    Persegipanjang Persegipanjang = new Persegipanjang();
                    System.out.println(Persegipanjang.toString());
                    System.out.println("Luas dari Persegi Panjang = " + Persegipanjang.getLuas());
                    System.out.println("Volume dari Balok = " + Persegipanjang.getVolume());
        
                    break;

                case 2:
                    segitiga segitiga = new segitiga();
                    System.out.println(segitiga.toString());
                    System.out.println("Luas dari Segitiga  = "+segitiga.getLuas());
                    System.out.println("Volume dari Prisma Segitiga = "+segitiga.getVolume());
                    break;

                case 3:
                    Tabung tabung = new Tabung();
                    System.out.println(tabung.toString());
                    System.out.println("Luas dari Lingkaran = "+tabung.getLuas());
                    System.out.println("Volume dari Tabung = "+tabung.getVolume());
                    break;

                case 4:
                    System.out.println("Exit...Thank you");
                    System.exit(4);

                default:
                    System.out.println("Unrecognized option");
            }
        }while(!letter.equalsIgnoreCase("Q"));
         sc.close();    
    }
}
