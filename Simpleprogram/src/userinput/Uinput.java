package userinput;
import java.util.Scanner;

public class Uinput {

	public static void main(String[]args) {
		Scanner obj =new Scanner(System.in);
		System.out.println("enter your details");
		
		String name =obj.nextLine();
		System.out.println("User name :"+name);
		
		int age=obj.nextInt();
		System.out.println("User age:"+age);
		

	}
}
