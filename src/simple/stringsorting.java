package simple;

public class stringsorting {

	public static void main(String[] args) {

	String str="Independence";
	str=str.replaceAll(" ", "");
	int count =0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='n')
			
		{
			count++;
			count=count+1;
		}

	}
	System.out.println("The occcurance of n in given string "+count);

	}

}
