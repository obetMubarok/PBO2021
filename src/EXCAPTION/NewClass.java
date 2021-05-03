package EXCAPTION;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka yang akan dikalikan 2 : ");
        try {
            int angka = in.nextInt();
            System.out.println(angka*2);
        } catch (InputMismatchException e) {
            System.out.println("salah input");
        }
        
        
    }
}
