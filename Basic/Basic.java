import java.util.Scanner;
/**
* First attempt at java syntax / basic
*
* author : Yeonjoon Choi
* Date : Feb 23rd 2016
*/
public class Basic{
	public static void main(String args[]){
		//public - Visibility 
		//static - Keyword that represets this does not need belong to a specific class
		//void - return type
		//main() - name of the method
		char a = 'a'; 
		int b = 10;	
		//USE printf for formatting the print stream
		System.out.printf("Character :  %c", a);
		System.out.println();
		System.out.printf("Decimal : %d",b);
		System.out.println();
		System.out.println("Character : "+a+"\n Decimal : "+b);  
		//User Inputs
		//Use of Scanner needs java.util.Scanner
		Scanner in = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = in.nextLine();
		System.out.println();
		System.out.println("Your name is "+name);
	
	}
}
