package EXCAPTION;

public class DemoExUncheck2 {
    public static void main(String[] args) {
        int[] data = {1, 4, 10};
        try {
            System.out.println(data[1]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indek keluar batas");
        }
        
        
    }
}
