package main;
import java.util.*;

public class Main 
{
	public static int digui(int a)
	{
		System.out.println("我接受到的参数是"+a+"我要对它进行-1的操作");
		a--;
		if(a<=0)
		{
			return a;
		}
		digui(a);
		System.out.println("这个数字目前是:"+a);
		return a;
	}
	public static void main(String[] args)
	{
		System.out.println("Hello,Github!");
		Scanner input = new Scanner(System.in);
		digui(input.nextInt());
		input.close();
	}
}
