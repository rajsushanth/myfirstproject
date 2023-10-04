 package mapp;
import java.util.HashMap;
public class Mapping {
public static void main(String[]args) {
	HashMap<Integer,String>name =new HashMap<Integer,String>();
	name.put(1,"raj");
	name.put(2,"kumar");
	System.out.println(name);
	System.out.println(name.get(1));
	
}
}
