package Tanya;

class Balok{    // Tugas 1
    private double panjang;
    private double lebar;
    private double tinggi;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    protected void hasil(){
        perhitungan ph = new perhitungan(getPanjang(), getLebar(), getTinggi());

        System.out.println("Hasil luas balok : " + ph.luasBalok());
        System.out.println("Hasil volume balok : " + ph.volumeBalok());
    }

}
class perhitungan{    //Tugas  2
    Balok data1 = new Balok();

    public perhitungan(double panjang, double lebar, double tinggi){
        data1.setPanjang(panjang);
        data1.setLebar(lebar);
        data1.setTinggi(tinggi);
    }
    
    public double luasBalok(){
        return 2 * data1.getPanjang();  //2*(p.l  + p.t + l.t)
    }

    public double volumeBalok(){
        return data1.getPanjang()+data1.getPanjang(); // p.l.t
    }
}
public class Percobaan {
    public static void main(String[] args) {
        Balok b1 = new Balok();

        b1.setPanjang(10);
        b1.setLebar(10);
        b1.setTinggi(10);

        
        b1.hasil();
    }
}