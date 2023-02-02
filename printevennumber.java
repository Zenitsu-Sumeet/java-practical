import java.util.Scanner;

class printevennumber{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the range of numbers");
        int range =in.nextInt();
        int n = in.nextInt();
        System.out.println("even number are between "+range+" and "+n+" are");
        for(int i=range;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
}
}