package simple;

public class vowelsconsoanats {

	public static void main(String[] args) {
String len1="My Country is my love";
String len2=len1.replace(" ", "");
char p[]= {'a','e','i','o','u'};
int  count=0;
int vowel=0;
for(int i=0;i<len2.length()-1;i++)
{
    char ch=len2.charAt(i);
    if(ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u') {
    	vowel++;
    }
}
int totallen=len2.length();
int consonant=totallen-vowel;
System.out.println(totallen);

System.out.println(vowel);
System.out.println(consonant);
}
	
}