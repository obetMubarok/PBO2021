
package POLYMORPHISM;
class Sim{
    private int detik;

    public Sim(int detik) {
        this.detik = detik;
    }

    public void setDetik(int detik) {
        this.detik = detik;
    }

    public int getDetik() {
        return detik;
    }
    public int getTarif(){
        return 0;
    }
}

class SimA extends Sim{

    public SimA(int detik) {
        super(detik);
    }
    public int getTarif(){
        return getDetik() * 20;
    }
}

class SimB extends Sim{

    public SimB(int detik) {
        super(detik);
    }
    public int getTarif(){
        return getDetik() * 10;
    }
    
}
public class DemoSim {
    public static void main(String[] args) {
        Sim s1 = new SimB(90);
        System.out.println(s1.getTarif());
    }
}
