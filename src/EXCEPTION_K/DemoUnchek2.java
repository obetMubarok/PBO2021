package EXCEPTION_K;

import java.io.FileNotFoundException;

public class DemoUnchek2 {
    public static void main(String[] args) {
        int data[] = {1, 2, 3};
        try {
            System.out.println(data[3]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("indek keluar batas");
        }
    }
}
