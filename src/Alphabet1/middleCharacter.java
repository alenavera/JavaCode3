package Alphabet1;
import java.util.Scanner;

public class middleCharacter {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Write down your word: ");
		String str=input.nextLine();
		
		int l=str.length();
		int k=l/2;
		char ch[]=str.toCharArray();
		System.out.println("Middle Character is: "+ch[k]);
	System.out.println(str.substring((l/2)-1,(l/2)+1));
		
		
	}
}