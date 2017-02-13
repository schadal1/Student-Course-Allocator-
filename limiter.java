
public class limiter {
	private static int sub1_limit;
	private static int sub2_limit;
	private static int sub3_limit;
	private static int sub4_limit;
	public limiter()
	{
		sub1_limit=0;
		sub2_limit=0;
		sub3_limit=0;
		sub4_limit=0;
	}
	public int get_sub1()
	{
		return sub1_limit;
	}
	public int get_sub2()
	{
		return sub2_limit;	
	}
	public int get_sub3()
	{
		return sub3_limit;	
	}
	public int get_sub4()
	{
		return sub4_limit;
	}
	public void set_sub1()
	{
		++sub1_limit;
	}
	public void set_sub2()
	{
		++sub2_limit;
	}
	public void set_sub3()
	{
		++sub3_limit;
	}
	public void set_sub4()
	{
		++sub4_limit;
	}
}
