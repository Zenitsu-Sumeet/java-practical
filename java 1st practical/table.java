import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        for(int i = 0; i <= 10; i++) {
            System.out.println(m+" x "+i + "=" + i*m);
        }
    }
}
