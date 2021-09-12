public class ReplaceJava
{
	public static void main(String[] args) {
		String s="Java is Object Oriented. Java is Programming Language.";
		String[] input= s.split(" ");
		s="";
		for (String s1 : input)
		{
		    if(s1.equals("Java"))
		    s1="C++";
		    s+=s1+" ";
		}
		System.out.println(s);
	}
}
