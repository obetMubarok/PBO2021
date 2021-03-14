package METHOD;
class Nasabah{
    private String nama;
    private String noRek;
    private double saldo;

    public Nasabah(String nama, String noRek, double saldo) {
        this.nama = nama;
        this.noRek = noRek;
        this.saldo = saldo;
    }
    public void infoNasabah(){
        System.out.println("Nama : "+nama);
        System.out.println("Rek  : "+noRek);
        System.out.println("Saldo: "+saldo);
    }
    public void setor(double nominal){
        saldo += nominal;
    }
    public void tarik(double nominal){
        saldo -= nominal;
    }
    public void transfer(Nasabah n, double nominal){
        saldo -= nominal;
        n.saldo += nominal;
    }
}
public class DemoNasabah {
    public static void main(String[] args) {
        Nasabah n1 = new Nasabah("Obet", "12345", 500000);
        Nasabah n2 = new Nasabah("Ali", "54321", 100000);
        
        n1.transfer(n2, 150000);
        n2.infoNasabah();
    }
}
