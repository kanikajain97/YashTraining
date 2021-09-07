
public class Main {
	public static void main(String[] args)
	{
		String s="SABBIR POONAWALA";
		String[] input = s.split(" ");
		s="";
		for(int i=0;i<input.length;i++)
		{
			char[] c = input[i].toCharArray();
			for(int j=0;j<c.length;j++)
			{
				if(j>1)
					c[j] = '*';
			}
			input[i]= new String(c);
		}
		for(int i=0;i<input.length;i++)
		{
			s+=input[i]+" ";
		}
		
		
		System.out.println(s);
	}

}