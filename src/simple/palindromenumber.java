package simple;

import java.util.Scanner;

public class palindromenumber {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int mynum=sc.nextInt();
int temp;
int sum=0;

int rem1=mynum/10;
int rem2=mynum%10;

System.out.println(rem1);

sum=sum+rem1;
sum=sum*10;

System.out.println(sum);


	}

}
