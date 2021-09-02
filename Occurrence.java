import java.util.*;
public class Occurrence
{
	public static void main(String[] args) {
		String data="Java is Object oriented. Java is platform independent.Java is simple.";
		String[] str=data.split(" |\\.");
		int count=0;
		for(int i=0;i<str.length;i++)
		{
		    if(str[i].equals("Java"))
		    count++;
		}

		System.out.println(count);
	}
}