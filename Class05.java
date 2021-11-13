package Java09;
class CCount	//(a)
{
	private static int cnt=0;
	public void count()
	{
		cnt++;
	}
	public void setZero()	//(b)
	{
		cnt=0;
	}
	public void setValue(int n)	//(c)
	{
		cnt=n;
	}
}
//(d)應該利用類別變數，因為實利變數必須先建立物件，再利用物件來呼叫的函數
//(e)類別函數