package function;

public class Raj22 {

		public int subnumbers(int num1,int num2) {
			int sum=num1-num2;
			return sum;
}
		public static void main(String[]args) {
			int a =10;
			int b =80;
			Raj22 obj=new Raj22();
			
			int sub=obj.subnumbers(a,b);
			System.out.println(sub);
		}
	}
