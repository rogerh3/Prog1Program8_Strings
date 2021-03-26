//Project: Project 8 - Strings
//Author: Roger H Hayden III
//Desc: Using Strings
//Version: 1.0
//Last Updated: 10/29

import java.util.Scanner; 

public class Strings_Prog8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initialize scanner
		Scanner keyboard = new Scanner(System.in); 
		//asking for name and giving length of name
		System.out.println("What is your name?");
		String name = keyboard.next();
		System.out.println("Your name is " + name.length() + " letters long"); 
		//asking for a word with a in it, then replacing a with u
		System.out.println("Type a word with the letter 'a' in it.");
		String nextWord = keyboard.next();
		System.out.println("If you replace the a in your word with a u it would be " + nextWord.replace('a', 'u'));
		//asking for a word or string with the letter u somewhere
		System.out.println("Type and word or string that contains the letter u");
		String str = keyboard.next();
		int first = str.indexOf('u') + 1; 
		System.out.println("The index of u is " + first);
		//asking for a string to
		System.out.println("Type in a single word");
		String str2 = keyboard.next();
		System.out.println("Your string in upper case is " + str2.toUpperCase());
		//asking for a string to trim
		System.out.println("Type in a string");
		String str1 = keyboard.next();
		System.out.println("Your string trimmed is trimmed after " + str1.trim());
		
		System.out.println("Thank you for playing");
		

		
	}

}
