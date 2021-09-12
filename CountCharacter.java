public class CountCharacter
{
	public static void main(String[] args) {
		String s="12, Ruther Ford Building, Lake Street, Chichago-29";
		s=s.replaceAll("\\s", ""); 
		char[] c=s.toCharArray(); 
		System.out.println(c.length);
	}
}