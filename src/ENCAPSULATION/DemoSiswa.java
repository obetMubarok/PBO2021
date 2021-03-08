package ENCAPSULATION;

class Siswa{
    private String nama;
    private int nilai;

    public String getNama() {
        return nama;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    
}
public class DemoSiswa {
    public static void main(String[] args) {
        Siswa s1 = new Siswa();
        s1.setNama("Iwan");
        s1.setNilai(25);
        s1.setNilai(s1.getNilai() + 50);//(25 + 50)
        
        System.out.println(s1.getNilai());
    }
}
