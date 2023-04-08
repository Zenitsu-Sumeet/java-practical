import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filecopy {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("sumeet");
            FileReader reader = new FileReader("sumeet");
            int c;
            while((c = reader.read())!= -1){
                System.out.print((char)c);
            }
        }catch(IOException i){
            System.out.println(i);
        }
    }
}
