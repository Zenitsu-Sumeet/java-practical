import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
       
     Scanner in = new Scanner(System.in);
	 int a;
	 System.out.println("Enter a number");
     a = in.nextInt();
	 System.out.println(isPalindrome(a));
    }
	public static boolean isPalindrome(int a) {
		String s = Integer.toString(a);
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
	}

    
}
