package FILE;

import java.io.FileWriter;
import java.io.IOException;

public class DemoWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileW = new FileWriter("src/FILE/data.txt", false);
        fileW.write("1\n");
        fileW.write("2\n");
        fileW.write("30\n");
        fileW.close();
    }
}
