package simple;

public class dulicatelements {

	public static void main(String[] args) {
String names[]= {"Java","Javascript","Ruby","Java1","Java2"};
int count=0;
	for(int i=0;i<names.length;i++)
		{
		for(int j=i+1;j<names.length;j++)
		{
			if(names[i].equals(names[j]))
					{
				count++;
				
					}
		}
		}
	System.out.println("The duplicate element is found"+count);

		}

}
