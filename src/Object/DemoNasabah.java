package Object;
class Nasabah{
    String nama;
    int saldo;
}
public class DemoNasabah {
    public static void main(String[] args) {
        Nasabah n1 = new Nasabah();
        Nasabah n2 = new Nasabah();
        int temp;
        n1.nama = "obet";
        n1.saldo = 100000;//memberi nilai
        //n1.saldo = n1.saldo + 50000;
        temp = n1.saldo;
        n1.saldo += 50000;
        System.out.println(temp);
        System.out.println("Saldo an. "+n1.nama+" Rp "+n1.saldo);
    }
}
