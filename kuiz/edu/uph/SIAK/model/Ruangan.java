package kuiz.edu.uph.SIAK.model;

public class Ruangan {
    String nama;

    public Ruangan() {
    }

    public Ruangan(String nama) {
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
        return nama;
    }

}
