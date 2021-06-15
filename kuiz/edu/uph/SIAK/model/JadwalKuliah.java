package kuiz.edu.uph.SIAK.model;
import java.util.ArrayList;

public class JadwalKuliah {
    ArrayList<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();
    Dosen dosen;
    MataKuliah mataKuliah;
    Ruangan ruangan;

    public JadwalKuliah() {
    }


    public JadwalKuliah(ArrayList<Mahasiswa> mahasiswa, Dosen dosen, MataKuliah mataKuliah, Ruangan ruangan) {
        this.mahasiswa = mahasiswa;
        this.dosen = dosen;
        this.mataKuliah = mataKuliah;
        this.ruangan = ruangan;
    }


    public ArrayList<Mahasiswa> getMahasiswa() {
        return this.mahasiswa;
    }

    public void setMahasiswa(ArrayList<Mahasiswa> mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Dosen getDosen() {
        return this.dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public MataKuliah getMataKuliah() {
        return this.mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public Ruangan getRuangan() {
        return this.ruangan;
    }

    public void setRuangan(Ruangan ruangan) {
        this.ruangan = ruangan;
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa){
        this.mahasiswa.add(mahasiswa);
    }

    public void tampilkanJadwalKuliah(){
        System.out.println("Jadwal Kuliah");
        System.out.println("Nama Matakuliah\t : "+getMataKuliah());
        System.out.println("Dosen\t\t : "+getDosen().toString());
        System.out.println("Ruangan\t\t : "+getRuangan().toString());
        System.out.println("Daftar Mahasiswa : ");
        System.out.println(" Nama \t\t\t StudentID \t\t Jenis Kelamin");
        for (Mahasiswa mhs : mahasiswa) {
            System.out.println(mhs.toString());
        }
    }

}
