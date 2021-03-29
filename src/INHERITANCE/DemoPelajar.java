package INHERITANCE;
class Pelajar{
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

class Mahasiswa extends Pelajar{

    public Mahasiswa(String jurusan, String fakultas) {
        this.jurusan = jurusan;
        this.fakultas = fakultas;
    }

    
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    private String jurusan;
    private String fakultas;

    public String getJurusan() {
        return jurusan;
    }

    public String getFakultas() {
        return fakultas;
    }
    
    public void infoMahasiswa(){
        System.out.println("Nama : "+getNama());
        System.out.println("Nilai : "+getNilai());
        System.out.println("Jurusan : "+jurusan);
        System.out.println("Fakultas : "+fakultas);
    }
}
class Siswa extends Pelajar{
    private int kelas;

    public Siswa(int kelas) {
        this.kelas = kelas;
    }

    public int getKelas() {
        return kelas;
    }

    public void setKelas(int kelas) {
        this.kelas = kelas;
    }
    
    public void infoSiswa(){
        System.out.println("Nama : "+getNama());
        System.out.println("Kelas : "+kelas);
        System.out.println("Nilai : "+getNilai());
    }
}
public class DemoPelajar {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("IT", "Teknik");
        Siswa s1 = new Siswa(9);
        m1.setNama("Obet Mubarok");
        m1.setNilai(90);
        s1.setNama("Ali");
        s1.setNilai(100);
        
        s1.infoSiswa();
        System.out.println("-----------------------------------");
        m1.infoMahasiswa();
    }
}
