package Java09;
public class Class07
{
	static void power(int x,int n)
	{
		int a=(int)Math.pow(x,n);
		System.out.println(x+"^"+n+"="+a);
	}
	public static void main(String[] args)
	{
		power(2,5);
		power(3,2);
	}
}