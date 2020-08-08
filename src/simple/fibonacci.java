package simple;

public class fibonacci {

	public static void main(String[] args) {
int t1=0;
int t2=1;
System.out.println( "The series is ");

for(int k=0;k<10;k++)
{
	int sum=t1+t2;
	t1=t2;
	t2=sum;
	System.out.println(+t1);}


	}

}
