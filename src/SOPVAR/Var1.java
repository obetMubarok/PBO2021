package SOPVAR;
public class Var1 {
    public static void main(String[] args) {
        //1. deklarasi var
        String nama, alamat;
        double bb;
        
        //2. inisialisasi var
        nama = "Obet";
        alamat = "Malang";
        bb = 70.245678;
        
        //3. proses
        
        //4. output
        // obet dari malang dengan bobot 70.245678 kg
        System.out.println(nama+" dari "+alamat+ "dengan bobot "+bb+" Kg.");
        System.out.format("%s dari %s dengan bobot %.2f Kg." , nama, alamat, bb);
    }
}
