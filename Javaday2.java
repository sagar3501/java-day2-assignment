package javaTraining;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CheckName{
	public String getname() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your name(contains only alphabets or numbers): ");
		String nameRegex ="^[[a-z][A-Z][0-9]]+";
		Pattern pattern = Pattern.compile(nameRegex);
		while(true) {
			String name = s.next();
			Matcher matcher = pattern.matcher(name);
			if(matcher.matches()) {
				return name;
			}
			else {
				System.out.print("Enter a valid name: ");
			}
		}
	}
}

class Emailchecker{
	public String getmail() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter you Mail:");
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@([a-z])+(.com)$";
		Pattern pattern = Pattern.compile(emailRegex);
		while(true) {
			String mail=s.next();
			Matcher matcher =pattern.matcher(mail);
			if(matcher.matches()) {
				return mail;
			}
			else {
				System.out.print("Enter a valid mail: ");
			}
		}
	}
}

class DOB{
	public String getDate() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Date (DD/MM/YYYY): ");
		String dateRegex = "^((0[1-9]|[12][0-9]|3[01])/0[1-9]|1[0-2])/([0-9]{4})$";
		Pattern pattern = Pattern.compile(dateRegex);
		while(true) {
			String date=s.next();
			Matcher matcher = pattern.matcher(date);
			if(matcher.matches()) {
				return date;
			}
			else {
				System.out.print("Enter a valid date format: ");
			}
		}
	}
}


public class Javaday2 {

	public static void main(String[] args) {
		CheckName n = new CheckName();
		String name = n.getname();
		Emailchecker check = new Emailchecker();
		String mail=check.getmail();
		DOB d = new DOB();
		String date = d.getDate();
		System.out.println("----------------------------------");
		System.out.println("Your name :"+name);
		System.out.println("Your mail : "+mail);
		System.out.println("Your date of birth : "+date);
		
	}

}
