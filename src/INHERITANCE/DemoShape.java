package INHERITANCE;
class Shape{
    private String warna;

    public Shape(String warna) {
        this.warna = warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }
    
}

class Lingkaran extends Shape{
    private double radius;

    public Lingkaran(double radius, String warna) {
        super(warna);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }    
}

class Persegi extends Shape{
    private double sisi;

    public Persegi(double sisi, String warna) {
        super(warna);
        this.sisi = sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }
    
}
public class DemoShape {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5, "Merah");
        Lingkaran l2 = new Lingkaran(6, "Kuning");
        System.out.println("Warna : "+l1.getWarna());
        System.out.println("Radius : "+l1.getRadius());
        System.out.println("------------------------------");
        System.out.println("Warna : "+l2.getWarna());
        System.out.println("Radius : "+l2.getRadius());
        
    }
}
