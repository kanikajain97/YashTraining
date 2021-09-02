import java.util.*;
public class Descending
{
	public static void main(String[] args) {
	    int a[]={8,2,3,1,6,5,7,9,2,3};
	    

		for (int i = 0; i < 10; i++) 
        {
            for (int j = i + 1; j < 10; j++) 
            {
                if (a[i] < a[j]) 
                {
                   int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Descending Order:");
        for (int i = 0; i < 10 - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
	}
}