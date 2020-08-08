package simple;

import java.util.Arrays;

public class arrayaddition {

	public static void main(String[] args) {
int []a= {2,4,6};

int []b= {3,5,7};
int[] result1 = add(a, b);
int[] prime = { 2, 3, 5, 7 }; 

System.out.println("A Type array: " + Arrays.toString(a));
System.out.println("B  Type array: " + Arrays.toString(b));
System.out.println("Array Addition is: " + Arrays.toString(result1));
result1 = add(a, prime);

System.out.println("Addition of even and Prime: " + Arrays.toString(result1));


}

	private static int[] add(int[] first, int[] second) {
int len1;
len1=first.length;
int len2=second.length;
int temp=0;


		
	int result[]=new int[len1];
	for(int i=0;i<temp;i++)
	{
		result[i]=first[i]+second[i];
		
	}
	

return result;		
	}

}
