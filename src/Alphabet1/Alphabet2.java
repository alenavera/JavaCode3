	package Alphabet1;

import java.util.Scanner;

public class Alphabet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		 System.out.println("Enter a character "); 
		 
		 char ch=input.next( ).charAt(0);
		 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			 System.out.println(ch+" is  Vowel");
		 }
			else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
				System.out.println(ch+" is Consonant");
			else 
				System.out.println("Sorry, it is incorrect");
		
		   }
		
	}


