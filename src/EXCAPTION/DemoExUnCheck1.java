
package EXCAPTION;
public class DemoExUnCheck1 {
    public static void main(String[] args) {
        try {
            int nilai = 6/0;
        } catch (ArithmeticException e) {
            System.out.println("pembagi tidak boleh 0");
        } catch (NumberFormatException e){
            System.out.println("pembagi tidak boleh text");
        }
        
        
    }
}
