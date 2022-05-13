package collection;

import java.util.Collections;
import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("Physics", 1);
		map.put("English", 2);
		System.out.println(Collections.singleton(map));

	}

}
