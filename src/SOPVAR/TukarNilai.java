package SOPVAR;
public class TukarNilai {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        
        c = a; //5
        a = b;//7
        b = c;//5
        
        System.out.println(a);
        System.out.println(b);
    }
}
