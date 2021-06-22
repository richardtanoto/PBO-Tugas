package UTS;
import UTS.classx.*;
import java.util.Scanner;


public class App {
/* 
    Nama : Richard Tanoto
    StudentID : 03082200019
*/
public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int pilih;
    String letter = "";
    do{

        Mahasiswa mhs = new Mahasiswa("Budi");
    
        MataKuliah mk1 = new MataKuliah("MK001", "PBO         ", 3);
        MataKuliah mk2 = new MataKuliah("MK002", "Kewarganegraan", 2);
        MataKuliah mk3 = new MataKuliah("MK003", "Matematika", 4);


        KartuHasilStudi khs = new KartuHasilStudi(3,mhs);
        khs.tambahNilaiStudi(mk1, 'A');
        khs.tambahNilaiStudi(mk2, 'A');
        khs.tambahNilaiStudi(mk3, 'A');

        System.out.println("Menu:");

        System.out.println("Pilih 1 : Tampilkan KHS");
        System.out.println("Pilih 2 : Exit");

        System.out.print("Answer :  ");
        pilih = sc.nextInt();
        System.out.println("");
        
        if (pilih == 1){
            khs.tampilkanKHS();
            System.out.println();
        }
        else if(pilih == 2){
            break;
        }

    }while(!letter.equalsIgnoreCase("Q"));
    sc.close();

}
}
