package simple;

public class palindrome {

	public static void main(String[] args) {
String str="India is my country";
int len1=str.length();
System.out.println(+len1);
String reverse="";

str=str.replaceAll(" ", "");
int len=str.length();
System.out.println(+len);

for(int i=len-1;i>=0;i--)
{
	reverse=reverse+(str.charAt(i));
	
}
System.out.println("The palindrome word is::"+reverse);

	}

}
