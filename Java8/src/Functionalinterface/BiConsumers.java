package Functionalinterface;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class BiConsumers {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		
		map.put("hi", "oo");
		map.put("happy", "h");
		map.put("what", "w");
		map.forEach((k,v)->System.out.println(k+"and"+v));
		
		
		
		map.forEach((k,v)-> { System.out.println(k+"and"+v));
		Biconsumers<String,String> bi =(k,v)->System.out.println(k+"for"+v);
		map.forEach(bi);
		}

}
}
