package function;

public class Raj24 {
	public int dividenumbers(int num1,int num2) {
		int sum=num1/num2;
		return sum;
}
	public static void main(String[]args) {
		int a =10;
		int b =80;
		Raj24 obj=new Raj24();
		
		int divide=obj.dividenumbers(a,b);
		System.out.println(divide);
	}
}

