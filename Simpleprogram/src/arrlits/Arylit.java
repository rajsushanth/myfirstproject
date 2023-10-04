package arrlits;
import java.util.ArrayList;

public class Arylit {
public static void main(String[]args) {
	ArrayList<String>color =new ArrayList<String>();
	color.add("Black");
	color.add("Blue");
	color.add("Green");
	color.add("Yellow]");
	color.add("Orange");
	color.set(1, "Red");
	color.remove(4);
	System.out.println(color);
	System.out.println(color.get(0));
	
	
	
	
}
}
