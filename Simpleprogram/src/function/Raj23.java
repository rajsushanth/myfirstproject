package function;

public class Raj23 {
	public int multiplynumbers(int num1,int num2) {
		int sum=num1*num2;
		return sum;
}
	public static void main(String[]args) {
		int a =10;
		int b =80;
		Raj23 obj=new Raj23();
		
		int multiply=obj.multiplynumbers(a,b);
		System.out.println(multiply);
	}
}
