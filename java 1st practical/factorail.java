import java.util.Scanner;

public class factorail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(fact(a));

    }
    static int fact(int a){
        if(a==1){
            return 1;
        }
        return a*fact(a-1);
    }
}
