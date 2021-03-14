package METHOD;
class Celcius{
    private double suhuC;

    public Celcius(double suhuC) {
        this.suhuC = suhuC;
    }
    public double toKelvin(){
        return suhuC + 273;
    }
    public double toReamur(){
        return (double)4/3 * suhuC;
    }
    public double toFahrenheit(){
        return (double) 9/5 * suhuC + 32;
    }

    public double getSuhuC() {
        return suhuC;
    }
    
}
public class DemoCelcius {
    public static void main(String[] args) {
        Celcius c1 = new Celcius(45);
        System.out.println("Suhu Celcius : "+c1.getSuhuC());
        System.out.println("Konversi ke Kelvin : "+c1.toKelvin());
        System.out.println("Konversi ke Fahrenheit : "+c1.toFahrenheit());
        System.out.println("Konversi ke Kelvin : "+c1.toReamur());
    }
}
