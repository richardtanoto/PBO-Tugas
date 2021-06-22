package UTS.classx;

public class NilaiStudi {
    MataKuliah MataKuliah ;
    char NilaiHuruf;
    static int count = 1 ;


    public NilaiStudi(MataKuliah mk,char NilaiHuruf) {
        this.MataKuliah = mk;
        this.NilaiHuruf = NilaiHuruf;
    }

    public int getSKS(){
        int sks = MataKuliah.SKS;
        return sks;
    }

    public MataKuliah getMataKuliah() {
        return this.MataKuliah;
    }

    public void setMataKuliah(MataKuliah MataKuliah) {
        this.MataKuliah = MataKuliah;
    }

    public char getNilaiHuruf() {
        return this.NilaiHuruf;
    }

    public void setNilaiHuruf(char NilaiHuruf) {
        this.NilaiHuruf = NilaiHuruf;
    }

    public double getNilaiAngka() {
        Double nilaiangka = 0.0;
        if (NilaiHuruf == 'A'){
            nilaiangka = 4.0;
        }
        else if (NilaiHuruf == 'B'){
            nilaiangka = 3.0;
        }
        else if (NilaiHuruf == 'C'){
            nilaiangka = 2.0;
        }
        else if (NilaiHuruf == 'D'){
            nilaiangka = 1.0;
        }
        else {
            nilaiangka = 0.0;
        }
        return nilaiangka;
    }


    @Override
    public String toString() {
        return "" +
            "\t" + MataKuliah.getKodeMataKuliah() + "\t\t\t" +
            " " + MataKuliah.getNamaMataKuliah() + "\t\t\t" +
            " " + MataKuliah.getSKS() + "\t\t" +
            " " + this.NilaiHuruf;
    }
    
}
