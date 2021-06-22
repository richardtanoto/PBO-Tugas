package UTS.classx;

import java.util.ArrayList;

public class KartuHasilStudi {
    ArrayList<NilaiStudi> nilaistudi = new ArrayList<NilaiStudi>();
    Mahasiswa mahasiswa;
    int semester;
    MataKuliah matakuliah;

    public KartuHasilStudi(int semester, Mahasiswa mhs){
        this.semester = semester;
        this.mahasiswa = mhs;
    }

    public int getSemester() {
        return this.semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Mahasiswa getMahasiswa() {
        return this.mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public ArrayList<NilaiStudi> getNilaiStudi() {
        return this.nilaistudi;
    }

    public void setNilaiStudi(ArrayList<NilaiStudi> nilaistudi) {
        this.nilaistudi = nilaistudi;
    }

    public void tambahNilaiStudi(MataKuliah mk,char nilai){
        NilaiStudi ns = new NilaiStudi(mk, nilai);
        nilaistudi.add(ns);
    }
   
    public int totalSKS(){
        int total = 0;
        for (NilaiStudi nilai : nilaistudi){
            total += nilai.getSKS();
        }
        return total;
    }

    public double ipk(){
        double totalsatu = 0.0, totaldua = 0.0;
        for(NilaiStudi i : nilaistudi){
            totalsatu += i.getNilaiAngka() * i.getMataKuliah().getSKS();
            totaldua += i.getSKS();
        }
        return totalsatu/totaldua;
    }

    public void tampilkanKHS(){
        int count = 1;
        System.out.println("Nama Mahasiswa : " + mahasiswa.nama);
        System.out.println("Semester : " + semester);
        System.out.println("IPK : " + ipk());
        System.out.println("Total SKS : " + totalSKS());
        System.out.println("");
        System.out.println("Nilai");
        System.out.println("No.\t" +  "Kode MataKuliah\t\t" + "Nama MataKuliah\t\t\t" + "Sks\t\t\t" + "Nilai");
        for(NilaiStudi a : nilaistudi){
            System.out.print(count);
            System.out.println(a.toString());
            count++;
        }
    }
}
