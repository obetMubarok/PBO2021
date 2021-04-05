package TUGAS;
class BangunRuang{
    private String warna;

    public BangunRuang(String warna) {
        this.warna = warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }
    
}

class Bola extends BangunRuang{
    private double jari;

    public Bola(double jari, String warna) {
        super(warna);
        this.jari = jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }
    
    public double getVolBola(){
        return (double)4/3 * 3.14 * jari *jari;
    }
    public double getLuasBola(){
        return 4 * 3.14 *jari *jari;
    }
}
class Kubus extends BangunRuang{
    private double sisi;

    public Kubus(double sisi, String warna) {
        super(warna);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    public double getVolKubus(){
        return sisi * sisi * sisi;
    }
    public double getLuasKubus(){
        return 6 * sisi * sisi;
    }
}
public class Tugas2A {
    public static void main(String[] args) {
        Kubus k1 = new Kubus(5, "Merah");
        
        System.out.println(k1.getLuasKubus());
    }
}
