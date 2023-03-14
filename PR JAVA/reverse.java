import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(ulta(a));

       
    }
     static int ulta(int a) {
        int rev = 0;
        while (a!= 0) {
            int rem = a % 10;
            rev = rev * 10 + rem;
            a /= 10;
        }
        return rev;
    
}
}
