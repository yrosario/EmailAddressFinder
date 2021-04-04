/*This class used to find an email address within a String
*/

package jav.emailaddressfinder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class EmailAddressFinder {
	
	private ArrayList<String> allEmails = new ArrayList<String>();
	private String emailPattern = "[a-zA-Z0-9]+[[.]*[a-zA-Z0-9]*]*@{1}[a-zA-Z]+[.]*[a-zA-Z0]*.{1}[a-zA-Z]+";
	
	public void findEmails(String text) {
		
		Matcher emailsFound = Pattern.compile(emailPattern).matcher(text);
		
		while(emailsFound.find()) {
			allEmails.add(emailsFound.group());
		}
	}
	
	public void print() {
		System.out.print(allEmails);
	}

}
