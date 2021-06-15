package kuiz.edu.uph.SIAK.model;

public class Dosen {
    // Nama dosen
    String nama;

    public Dosen() {
    }

    public Dosen(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return getNama();
    }
}
