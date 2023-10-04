package overriding;

public class Ovrd1 {

	public void dog() {
		System.out.println("puppy");
	}
	public static void main(String[]args) {
		Ovrd obj = new Ovrd();
		obj.dog();
	}
}

