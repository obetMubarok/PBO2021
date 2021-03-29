package INHERITANCE;
class Ayah{
    String a = "OOP";
    public void tampilA(){
        System.out.println(a);
    }
}
class Anak extends Ayah{
    String a = "JAVA";
    public void tampilA(){
        System.out.println(a);
    }
    public void info(){
        super.tampilA();
    }
}
public class DemoSuperVarMethod {
    public static void main(String[] args) {
        Anak a1 = new Anak();
        a1.info();
    }
}
