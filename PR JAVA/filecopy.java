import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filecopy {
    public static void main(String[] args) throws IOException {

        FileInputStream r = new FileInputStream("GTR.txt");
        FileOutputStream w = new FileOutputStream("copy.txt");

        int c;
        while ((c = r.read()) != -1) {
            w.write((char) c);
        }
        System.out.println("data written");

    }
}
