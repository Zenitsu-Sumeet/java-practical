import java.util.Scanner;

import javafx.scene.transform.Scale;

public class palindromenumber{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        System.out.println(isPalindrome(a));

    }
    public static int isPalindrome(int a) {
        if(a < 0){
            return 0;
        }
        if(a == 0){
            return 1;
        }
        if(a % 10 == 0){
            return isPalindrome(a / 10);
        }
        return a;
        
    }
}