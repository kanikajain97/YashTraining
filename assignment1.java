                Armstrong No

class Armstrong
{
	public static void main(string args[])
	{
		int n=153, a, s=0, n1;
		n1=n;
		while(n!=0)
		{
			a=n%10;
			s=s+a*a*a;
			n=n/10;
		}
		if(n1==s)
		{
			System.out.println("No. is Armstrong");
		}
			else
			{
				System.out.println("No is not Armstrong");
			}
	}
}




				Reverse No
				
class Reverse
{
	public static void main(string args[])
	{
		int n= 25, s=0, a;
		while (n!=0)
		{
			a=n%10;
			s=s*10+a;
			n=n/10;
		}
		System.out.println(s);
	}
}



				Array Third Highest Value
				
import java.util.Arrays;
class ThirdHighest
{
	public static void main(String args[])
	{
		int array[]={10,20,5,80,30,66};
		int size=array.length;
		Arrays.sort(Array);
		int max=array[size-3];
		System.out.println("3rd highest value is:"+max);
	}
}
				

				