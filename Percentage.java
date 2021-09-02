import java.util.*;
public class Percentage
{
	public static void main(String[] args) {
		int[] num= new int[5];
		int sum=0;
		float percentage=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
		    int temp=sc.nextInt();
		    sum=sum+temp;
		}
		percentage = (float)(sum*100)/500;
		System.out.println(percentage);
	}
}