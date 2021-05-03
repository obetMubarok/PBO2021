package EXCEPTION_K;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoUncheck3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi : ");
        int sisi=0;
        try {
            sisi = input.nextInt();
            System.out.println("Luas Persegi : "+sisi*sisi);
        } catch (InputMismatchException e) {
            System.out.println("Inputan harus angka");
        }
        
        
    }
}
