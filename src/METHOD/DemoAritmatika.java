package METHOD;
class Aritmatika{
    public int tambah(int bil1, int bil2){
        return bil1+bil2;
    }
    public int tambah(int bil1, int bil2, int bil3){
        return bil1+bil2+bil3;
    }
    public double tambah(double bil1, double bil2){
        return bil1 + bil2;
    }
}
public class DemoAritmatika {
    public static void main(String[] args) {
        Aritmatika a1 = new Aritmatika();
        System.out.println(a1.tambah(4, 5.3));
    }
}
