class thread1 extends Thread
{
	public void run()
	{
		for(int i=0; i<=9; i++)
		System.out.println("This is child thread");
	}
}
class threadDemo
{
	public static void main(String[] args)
	{
	thread1 t = new thread1();
	t.start();
	for(int i=0; i<=9; i++)
	System.out.println("This is main thread");
	}
}