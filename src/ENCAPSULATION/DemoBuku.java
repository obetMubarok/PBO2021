package ENCAPSULATION;
class Buku{
    private String judul;
    private String penulis;
    private int stok;

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getStok() {
        return stok;
    }
    
}
public class DemoBuku {
    public static void main(String[] args) {
        Buku b1 = new Buku();
        b1.setJudul("Pemrograman Java");
        b1.setPenulis("Obet");
        b1.setStok(15);
        b1.setStok(b1.getStok() + 10);// nilai Stok + 10
        
        System.out.println("buku berjudul "+b1.getJudul()+
                " dengan penulis "+b1.getPenulis()+
                " Sisa Stok : "+b1.getStok());
    }
}
