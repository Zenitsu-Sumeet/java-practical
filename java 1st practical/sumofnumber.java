import java.util.Scanner;

public class sumofnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        System.out.println(sumofnumberr(a));


    }
    static int sumofnumberr(int a){
        int sum=0;
        for(int i=1;i<=a;i++){
            sum=i*a;
        }
        return sum;
    }
    
}
