import java.util.Scanner;

public class printoddnumber {
    public static void main(String[] args) {
        System.out.println("enter the number to print odd number in range");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int range=sc.nextInt();
        System.out.println("range: ");
        for(int i=n;i<=range;i++){
            if(i%2!=0){
                System.out.println(i);
            }
    }   
}
}