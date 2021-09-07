public class Char {
	public static void main(String[] args)
	{
		String s="halo";
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a')
				c[i] = 'e';
			c[2]= Character.toUpperCase(c[2]);
		}
		s= new String(c);
		System.out.println(s);
	}

}