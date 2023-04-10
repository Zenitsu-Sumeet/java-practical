public class multi
{
	public static void main(String[] args)
	{
		try
		{
			int x=0,y=20,c;
			c=y/x;
			System.out.println(c);
			int[] m = {1,2,3,4,5};
			System.out.println(m[4]);
			String str = null;
			System.out.println(str.toUpperCase());
		}
		catch(ArithmeticException a)
		{
			System.out.println("Number is not divided by zero");
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Array indexx not found");
		}
		catch(Exception e)
		{
			System.out.println("Do not have name");
		}
	}
}