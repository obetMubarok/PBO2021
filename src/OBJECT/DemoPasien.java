package OBJECT;
class Pasien{
    String nama;
    String rm;
    int umur;
}
public class DemoPasien {
    public static void main(String[] args) {
        Pasien p1 = new Pasien();
        Pasien p2 = new Pasien();
        
        p1.nama = "Obet";
        p1.rm = "202112345";
        p1.umur = 17;
        p1.nama = "Iwan";//ubah nama kembali
        
        
        p2.nama = "Ali";
        p2.rm = "202012345";
        p2.umur = 5;
        
        System.out.println("Nama Pasien ke-1 : "+p1.nama);
        System.out.println("Nama Pasien ke-2 : "+p2.nama);
    }
}
