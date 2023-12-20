package Tugas.Tugas_Alpro_8.Arraylist;

public class SIM {
    private String name;
    private String ttg;
    private String lhr;
    private String glg;
    private String klmn;
    private String Almt;
    private String kdlr;
    private String jnis;
    private String kota;

    public SIM(String name, String ttg, String lhr, String glg, String klmn, String Almt, String kdlr, String jnis,
            String kota) {
        this.name = name;
        this.lhr = lhr;
        this.ttg = ttg;
        this.glg = glg;
        this.klmn = klmn;
        this.Almt = Almt;
        this.kdlr = kdlr;
        this.jnis = jnis;
        this.kota = kota;
    }

    public String getlhr() {
        return this.lhr;
    }

    public String getttg() {
        return this.ttg;
    }

    public String getglg() {
        return this.glg;
    }

    public String getklmn() {
        return this.klmn;
    }

    public String getAlmt() {
        return this.Almt;
    }

    public String getkdlr() {
        return this.kdlr;
    }

    public String getjnis() {
        return this.jnis;
    }

    public String getkota() {
        return this.kota;
    }

    public String getName() {
        return this.name;
    }
}
