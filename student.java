
public class student {
	private  String student_name;
	private  int A,B,C,D;
	public void set_student(String s_name,int a,int b,int c,int d)
	{
		student_name=s_name;
		A=a;
		B=b;
		C=c;
		D=d;
	}
	public String get_name()
	{
		return student_name;
	}
	public int get_A()
	{
		return A;
	}
	public int get_B()
	{
		return B;
	}
	public int get_C()
	{
		return C;
	}
	public int get_D()
	{
		return D;
	}
}
