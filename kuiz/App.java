package kuiz;
import kuiz.edu.uph.SIAK.model.*;

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs1 = new Mahasiswa("Calvin   ", "01210112", false);
        Mahasiswa mhs2 = new Mahasiswa("Sri Rahayu", "01210113", true);
        Mahasiswa mhs3 = new Mahasiswa("Elvia    ", "01210114", true);

        
        JadwalKuliah jadwalKuliah = new JadwalKuliah();
        Dosen dos1 = new Dosen ("Ade Maulana");
        MataKuliah matkul = new MataKuliah("Pemrograman Berorientasi Objek");
        Ruangan rgn = new Ruangan("Microsoft Teams");
        jadwalKuliah.tambahMahasiswa(mhs1);
        jadwalKuliah.tambahMahasiswa(mhs2);
        jadwalKuliah.tambahMahasiswa(mhs3);
        jadwalKuliah.setDosen(dos1);
        jadwalKuliah.setMataKuliah(matkul);
        jadwalKuliah.setRuangan(rgn);
        jadwalKuliah.tampilkanJadwalKuliah();
    }
}
