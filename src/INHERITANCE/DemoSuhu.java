package INHERITANCE;

import KelasK.*;

class Suhu{
    private double nilaiSuhu;

    public double getNilaiSuhu() {
        return nilaiSuhu;
    }

    public void setNilaiSuhu(double nilaiSuhu) {
        this.nilaiSuhu = nilaiSuhu;
    }
    
}
class Celcius extends Suhu{
    public Celcius(double suhu) {
        setNilaiSuhu(suhu);
    }
    
    public double toKelvin(){
        return getNilaiSuhu() + 45;
    }
}
class Kelvin extends Suhu{
    public Kelvin(double suhu) {
        setNilaiSuhu(suhu);
    }
    
    public double toCel(){
        return getNilaiSuhu()+275;
    }
}
public class DemoSuhu {
    public static void main(String[] args) {
        Celcius c1 = new Celcius(45);
        System.out.println(c1.toKelvin());
    }
}
