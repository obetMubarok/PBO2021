package EXCEPTION_K;
public class DemoUncheck1 {
    public static void main(String[] args) {
        try {
            int nilai = 6/Integer.parseInt("gh");
            System.out.println(nilai);
        } catch (ArithmeticException e) {
            System.out.println("tidak boleh Pembagi 0 ");
        } catch (NumberFormatException e){
            System.out.println("tidak boleh pembagi huruf");
        }
        
    }
}
