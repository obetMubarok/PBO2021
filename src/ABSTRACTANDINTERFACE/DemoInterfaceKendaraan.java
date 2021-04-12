package ABSTRACTANDINTERFACE;
interface Kendaraan{
    public void start();
    public void stop();
}
class Mobil implements Kendaraan{

    @Override
    public void start() {
        System.out.println("Mobil Berjalan");
    }

    @Override
    public void stop() {
        System.out.println("Mobil Berhenti");
    }
    
}
class Motor implements Kendaraan{

    @Override
    public void start() {
        System.out.println("Motor Berjalan");
    }

    @Override
    public void stop() {
        System.out.println("Motor Berhenti");
    }
    
}
public class DemoInterfaceKendaraan {
    public static void main(String[] args) {
        Mobil m1 = new Mobil();
        Motor mt1 = new Motor();
        
        mt1.stop();
        m1.start();
    }
}
