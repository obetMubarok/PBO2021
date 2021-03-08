package OBJECT;

class Mahasiswa{
    private String nama;
    private int nilai;
    
    public void setNama(String nama){
        this.nama = nama;// nama = Obet;
    }
    public String getNama(){
        return nama;
    }
    public void setNilai(int nilai){
        this.nilai = nilai;
    }
    public int getNilai(){
        return nilai;//mengembalikan var nilai
    }
}
public class DemoMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa();
        m2.setNama("Ali");
        m1.setNama("Obet Mubarok");
        m1.setNilai(90);
        
        System.out.println("Nama Mahasiswa ke-1 "+m1.getNama());
        System.out.println("Nilai mhs ke-1 : "+m1.getNilai());
        
        System.out.println("Nama Mahasiswa ke-2 "+m2.getNama());
        System.out.println("Nilai mhs ke-2 : "+m2.getNilai());
    }
}
