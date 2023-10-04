package arrlits;

import java.util.ArrayList;
import java.util.LinkedList;
public class LinkLts {
	public static void main(String[]args) {
		LinkedList<String>color =new LinkedList<String>();
		color.add("Black");
		color.add("Blue");
		color.add("Green");
		color.addFirst("Yellow]");
		color.addLast("Orange");
		color.removeFirst();
		color.removeLast();
		System.out.println(color);
		System.out.println(color.get(0));

}
	}
