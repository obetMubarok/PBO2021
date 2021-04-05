package POLYMORPHISM;
class Hewan{
    public void infoSuara(){
        System.out.println("suara");
    }
}

class Anjing extends Hewan{
    public void infoSuara(){
        System.out.println("Woof");
    }
}

class Bebek extends Hewan{
    public void infoSuara(){
        System.out.println("Quack");
    }
}

class Kucing extends Hewan{
    public void infoSuara(){
        System.out.println("Meong");
    }
}

public class DemoHewan {
    public static void main(String[] args) {
        Hewan h1;
        Kucing k1 = new Kucing();
        Anjing a1 = new Anjing();
        Bebek b1 = new Bebek();
        
        h1 = new Kucing();
        //h1 = b1;
        //h1 = new Kucing();
        h1.infoSuara();
        
    }
}
