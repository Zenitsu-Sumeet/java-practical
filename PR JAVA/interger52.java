import java.util.Scanner;

public class interger52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
     
        System.out.println("enter the number");
        a = in.nextInt();
       
        if(a%5==0||a%2==0){
            System.out.println(a+" is divisible by 5 or 2");

        }
        else{
            System.out.println(a+" is not divisible by 5 or 2");
        }
    }
}
