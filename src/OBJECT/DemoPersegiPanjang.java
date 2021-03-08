package OBJECT;

class PersegiPanjang{
    int panjang;
    int lebar;
}
public class DemoPersegiPanjang {
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 5;
        pp1.lebar = 3;
        
        System.out.println("Panjang : "+pp1.panjang);
        System.out.println("Lebar : "+pp1.lebar);
        System.out.println("Luas : "+pp1.panjang * pp1.lebar);
    }
}
