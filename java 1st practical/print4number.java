import java.util.Scanner;

public class print4number {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int number = 8;
        System.out.println(number);
        for (int i = 1; i <= n ; i++) {
                System.out.println(number);
                number = number+4*i;
    
    }
}
}
