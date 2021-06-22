package UTS.classx;

public class MataKuliah {

    String KodeMataKuliah;
    String NamaMataKuliah;
    int SKS;

    public MataKuliah(String kodematakuliah,String namamatakuliah,int SKS) {
        this.KodeMataKuliah = kodematakuliah;
        this.NamaMataKuliah = namamatakuliah;
        this.SKS = SKS;
    }

    public String getKodeMataKuliah() {
        return this.KodeMataKuliah;
    }

    public void setKodeMataKuliah(String KodeMataKuliah) {
        this.KodeMataKuliah = KodeMataKuliah;
    }

    public String getNamaMataKuliah() {
        return this.NamaMataKuliah;
    }

    public void setNamaMataKuliah(String NamaMataKuliah) {
        this.NamaMataKuliah = NamaMataKuliah;
    }

    public int getSKS() {
        return this.SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

}
