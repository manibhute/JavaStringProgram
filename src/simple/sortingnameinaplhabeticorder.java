package simple;

import java.util.Arrays;

public class sortingnameinaplhabeticorder {
public static void sorting()
{
	String [] a = {"English","German","Italian","Korean","Blablablabla.."};
	
	for(int i = 0;i<a.length;i++)
	{
	  System.out.println(a[i]);
	}
	Arrays.sort(a);
	System.out.println("After sort :");
	for(int i = 0;i<a.length;i++)
	{
	  System.out.println(a[i]);
	}

	}
	
	

	public static void main(String[] args) {

		sorting();
		
	}

}
