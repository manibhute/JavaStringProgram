package simple;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordvalidation {

//A password is considered valid if all the following constraints are satisfied:

/*It contains at least 8 characters and at most 20 characters.
It contains at least one digit.
It contains at least one upper case alphabet.
It contains at least one lower case alphabet.
It contains at least one special character which includes !@#$%&*()-+=^.
It doesn’t contain any white space.*/
	/*Approach: This problem can be solved by using Regular Expression.
	 * regex = “^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8, 20}$”


	 */
	    public static void main(String args[]) 
	    { 
	  
	        // Test Case 1: 
	        String str1 = "Geeks@portal20"; 
	        System.out.println(isValidPassword(str1)); 
	  
	        // Test Case 2: 
	        String str2 = "Geeksforgeeks"; 
	        System.out.println(isValidPassword(str2)); 
	  
	        // Test Case 3: 
	        String str3 = "Geeks@ portal9"; 
	        System.out.println(isValidPassword(str3)); 
	  
	        // Test Case 4: 
	        String str4 = "1234"; 
	        System.out.println(isValidPassword(str4)); 
	  
	        // Test Case 5: 
	        String str5 = "Gfg@20"; 
	        System.out.println(isValidPassword(str5)); 
	  
	        // Test Case 6: 
	        String str6 = "geeks@portal20"; 
	        System.out.println(isValidPassword(str6)); 
	    } 

		 public static boolean
		    isValidPassword(String password) 
		    { 
		  
		        // Regex to check valid password. 
		        String regex = "^(?=.*[0-9])"
		                       + "(?=.*[a-z])(?=.*[A-Z])"
		                       + "(?=.*[@#$%^&+=])"
		                       + "(?=\\S+$).{8,20}$"; 
		  
		        // Compile the ReGex 
		        Pattern p = Pattern.compile(regex); 
		  
		        // If the password is empty 
		        // return false 
		        if (password == null) { 
		            return false; 
		        } 
		  
		        // Pattern class contains matcher() method 
		        // to find matching between given password 
		        // and regular expression. 
		        Matcher m = p.matcher(password); 
		  
		        // Return if the password 
		        // matched the ReGex 
		        return m.matches(); 
		    } 
		  

}
