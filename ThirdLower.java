import java.util.*;
public class ThirdLower
{
    static void convertOpposite(StringBuffer str)
    {
        int ln = str.length();
 
        // Conversion using predefined methods
        for (int i = 0; i < ln; i++) {
            Character c = str.charAt(i);
            if (i == 2  && Character.isLowerCase(c))
                str.replace(i, i + 1,
                            Character.toUpperCase(c) + "");
            
        }
        System.out.println(str);
    }
 
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter 5 names");
	    for(int i=0;i<5;i++)
	    {
	        String s = sc.nextLine();
	        StringBuffer str
            = new StringBuffer(s);
	    
		convertOpposite(str);
	    }
	    
	}
}
