package OBJECT;

class Tabungan{
    String nama;
    int saldo;
}
public class DemoTabungan {
    public static void main(String[] args) {
        Tabungan t1 = new Tabungan();
        t1.nama = "obet";
        t1.saldo = 100000;
        //t1.saldo = t1.saldo + 50000; //100.000 + 50000
        t1.saldo += 50000;
        System.out.println("Nama Nasabah : "+t1.nama);
        System.out.println("Saldo Akhir : "+t1.saldo);
    }
}
