package simple;

import java.util.HashMap;

public class hashmapcountwords {

	public static void main(String[] args) {
	String 	s1= "My country is India.I love my India.I am very loyal to India";
	String s3="India";
	int count=0;
	int len=s1.length();
	String []s2=s1.split("");
	int counter=1;
	HashMap<String,Integer>h1=new HashMap <String,Integer >();
	for(int i=1;i<len;i++)
	{
		h1.put(s1, i);
		
}

	}
}

