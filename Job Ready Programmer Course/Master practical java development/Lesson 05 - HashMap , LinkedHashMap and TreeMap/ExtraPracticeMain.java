import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExtraPracticeMain {

	public static void main(String[] args) {
		
		// In short: Maps store keys that relate to values. 
		// HashMap, does not maintain the order of the values. 
		// LinkedHashMap, maintains the order of values based on when they are entered. 
		// TreeMap, maintains the order of values based on natural order (1,2,3,4 / a,b,c,d / with custom types based on the comparable interface).
		
		
		// ********* HashMap ********
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(3, "Hello");
		map1.put(1, "Bye");
		map1.put(2, "Good Morning");
		map1.put(3, "Dog");
		map1.put(6, "Good Morning");
	
		for (Integer key : map1.keySet()) {
			System.out.println(map1.get(key));
		}
		
		// As you can see, duplicate values are allowed, but duplicate keys are not. The hello entry is deleted and replayed by dog. Also, order
		// is not maintained in this HashMap. 
		
		System.out.println("\n--\n");
		
		// ********** LinkedHashMap *********
		
		LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>();
		
		map2.put(10, "Dog");
		map2.put(2, "Cat");
		map2.put(3, "Bird");
		map2.put(6, "Lion");
		map2.put(5, "Zebra");
		map2.put(0, "Horse");
		
		for (Integer key : map2.keySet()) {
			System.out.println(map2.get(key));
		}
		
		// Making one and iterating through it works the same as with a normal HashMap. As you can see, the order is maintained based on the moment entries are put. 
		
		System.out.println("\n--\n");
		
		// ********* TreeMap *******************
		
		TreeMap<Integer, String> map3 = new TreeMap<Integer, String>(map2);
		
		// For this example I convert the LinkedHasMap to a TreeMap. I'm going to iterate through the entries and not only the keys or values.
		
		for (Map.Entry<Integer, String> entry : map3.entrySet()) {
			System.out.println(entry);
		}
		
		// When we iterate through the entries, natural order is maintained based on the keys. 
		
	}

}
