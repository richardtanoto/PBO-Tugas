package P4.experiment;
import java.util.Scanner;

class Main {
  public void display_menu() {
    System.out.println ( "1) Program untuk Menghitung Luas Segitiga dan Volume Prisma Segitiga\n2) Program untuk Menghitung Luas Lingkaran dan Volume Tabung\n3) Program untuk Menghitung Luas Persegi Panjang dan Volume Balok" );
    System.out.print ( "Selection: " );

  }
  
  public Main() {
    Scanner sc = new Scanner ( System.in );
    float tinggi, alas, prisma, luas, volume, radius, panjang, lebar;
    float PI = (float) 3.14;
    String letter = "";
    display_menu();
    switch ( sc.nextInt() ) {
      
      case 1:
      do{
        System.out.println("[Program untuk Menghitung Luas Segitiga dan Volume Prisma Segitiga]");
        System.out.println("[Untuk menghentikan Program, Ketik Q]");
        System.out.println("Masukkan alas dari segitiga");
        alas = sc.nextFloat();
        System.out.println("Masukkan tinggi dari segitiga");
        tinggi = sc.nextFloat();
        System.out.println("Masukkan tinggi prisma");
        prisma = sc.nextFloat();
        luas = (alas*tinggi)/2;
        volume = ((alas*tinggi)/2)*prisma;
        System.out.println("Luas dari Segitiga = "+luas);
        System.out.println("Volume dari Prisma Segitiga = "+volume);
      }while(!letter.equalsIgnoreCase("Q"));
      
      case 2:
      do{
        System.out.println("[Program untuk Menghitung Luas Lingkaran dan Volume Tabung]");
        System.out.println("[Untuk menghentikan Program, Ketik Q]");
        System.out.println("Masukkan radius dari Lingkaran");
        radius = sc.nextFloat();
        System.out.println("Masukkan tinggi prisma");
        prisma = sc.nextFloat();
        luas = radius*radius*PI;
        volume = radius*radius*PI*prisma;
        System.out.println("Luas dari Lingkaran = "+luas);
        System.out.println("Volume dari Tabung = "+volume);
      }while(!letter.equalsIgnoreCase("Q"));
      case 3:
      do{
        System.out.println("[Program untuk Menghitung Luas Persegi Panjang dan Volume Balok]");
        System.out.println("[Untuk menghentikan Program, Ketik Q]");
        System.out.println("Masukkan panjang dari Persegi Panjang");
        panjang = sc.nextFloat();
        System.out.println("Masukkan lebar dari Persegi Panjang");
        lebar = sc.nextFloat();
        System.out.println("Masukkan tinggi Balok");
        prisma = sc.nextFloat();
        luas = panjang*lebar;
        volume = panjang*lebar*prisma;
        System.out.println("Luas dari Persegi Panjang = "+luas);
        System.out.println("Volume dari Balok = "+volume);
      }while(!letter.equalsIgnoreCase("Q"));
      default:
        System.err.println ( "Unrecognized option" );
        break;  
    }
    sc.close();
  }
public static void main ( String[] args ) {
  new Main();
}
}