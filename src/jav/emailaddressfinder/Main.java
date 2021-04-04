package jav.emailaddressfinder;

public class Main {

	public static void main(String[] args) {
		
		EmailAddressFinder finder = new EmailAddressFinder();
		String message = "Junk text for testing John@gmail.com, Brad.34Id@aol.com. More junk text bb@jgl.net, YrQWW.asdf.adsf@sdf.org";
		
		finder.findEmails(message);
		finder.print(); //expected result [John@gmail.com, Brad.34Id@aol.com, bb@jgl.net, YrQWW.asdf.adsf@sdf.org]

	}

}
