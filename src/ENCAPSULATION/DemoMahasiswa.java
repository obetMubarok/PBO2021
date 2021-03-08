package ENCAPSULATION;
class Mahasiswa{
    private int nilai;
    private String nama;
    public void setNilai(int nilai){
        this.nilai = nilai;
    }
    public int getNilai(){
        return nilai;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
}
public class DemoMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa();
        
        m1.setNilai(75);
        m1.setNama("Obet");
        
        m2.setNama("Ali");
        m2.setNilai(90);
        
        System.out.println("Nilai : "+m1.getNilai());
        System.out.println("Nama : "+m1.getNama());
        
        System.out.println("Nilai : "+m2.getNilai());
        System.out.println("Nama : "+m2.getNama());
    }
}
