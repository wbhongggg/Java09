class CRectangle
{
	int width;
	int height;
	public CRectangle(int w,int h)	//(a)
	{
		width=w;
		height=h;
	}
	public CRectangle()	//(c)
	{
		this(10,8);
	}
}