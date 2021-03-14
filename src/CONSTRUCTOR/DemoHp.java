package CONSTRUCTOR;
class HP{
    private String tipe;
    private int harga;

    public HP() {
    }

    public HP(String tipe) {
        this.tipe = tipe;
    }

    public HP(int harga) {
        this.harga = harga;
    }
    
    public HP(String tipe, int harga) {
        this.tipe = tipe;
        this.harga = harga;
    }
    public HP(int harga, String tipe) {
        this.tipe = tipe;
        this.harga = harga;
    }
    public String getTipe() {
        return tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
}
public class DemoHp {
    public static void main(String[] args) {
        HP hp1 = new HP("SA20", 1700000);
        HP hp2 = new HP("SA21");
        hp2.setHarga(1800000);
        HP hp3 = new HP(1900000, "SA30");
        
        System.out.println("Harga "+hp3.getTipe()+" Rp "+hp3.getHarga());
    }
}
