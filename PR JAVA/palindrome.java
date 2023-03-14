import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
       
     Scanner in = new Scanner(System.in);
	 int a;
	 System.out.println("Enter a number");
     a = in.nextInt();
	 isPalindrome(a);
    }
	public static void isPalindrome(int a) {
        int rev = 0;
        while (a> 0) {
            int rem = a % 10;
            a /= 10;
            rev = rev * 10 + rem;
        }
        if (rev == a) {
            System.out.println(" palindrome");
        }
        else {
            System.out.println(" not Palindrome");
        }
    
}
	}

    

