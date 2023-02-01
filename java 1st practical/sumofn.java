import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(sum(151));
        
    }
    static int sum(int a){
        int rev = 0;
        while (a<rev) {
            int rem = a / 10;
            rev = rev+rev+rev;
            a /= 10;
        }
        return rev;
    
}
}
