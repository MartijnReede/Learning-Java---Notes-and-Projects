import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main7 {

	public static void main(String[] args) {
		
		// *********** MAPS ************
		
		// The Map data structure doesn't belong to the collections framework. Maps belong to the Map Interface. 
		
		// A Map is basically a dictionary. You've got words and definitions. A map has keys and values.
		// The key would be the word in the dictionary, the value would be the explanation of the word. 
		
		
		// ********** HASHMAP ***********
		
		// This is how you create a HashMap.
		HashMap<String, String> dictionary = new HashMap<String, String>();
	
		// Each row of data is considered an entry which contains a key and a value. 
		// The order is not maintained in a normal HashMap
		
		// ************* INSERT DATA *************
		
		//Instead of add, we use put. 
		dictionary.put("Brave", "Ready to face and endure dangerous situations.");
		dictionary.put("Programmer", "Someone who writes software.");
		dictionary.put("Climber", "Someone who is climbing mountains.");
		dictionary.put("Skateboard", "A wooden plank with weels to do tricks on.");
		
		// ************ LOOP OVER HASHMAP *********
		
		// We can use the for-each loop, but we have to tell the computer if it's going to iterate through the keys or values. 
		
		for (String word : dictionary.keySet()) {
			System.out.println(word);
		}
		
		System.out.println("\n--\n");
		
		// To get the descriptions for each word, I can use this method:
		
		for (String word2 : dictionary.keySet()) {
			System.out.println(dictionary.get(word2));
		}
		
		System.out.println("\n--\n");
		
		// An entrySet is the key and the value together. To iterate through them both:
		
		// each result will be an entry of type String, String, and we are iteration through each entrySet.
		for (Map.Entry<String, String> entry : dictionary.entrySet()) {
			System.out.print(entry.getKey() + " - ");
			System.out.println(entry.getValue());
		}
		System.out.println("\n--\n");
		
		// ************* LINKEDHASHMAP ************
		
		// Works the same as a HashMap, but it maintains the order of entries.
		LinkedHashMap<String, String> linkedDictionary = new LinkedHashMap<String, String>();
		
		// ************* TREE MAP *******************
		
		// A TreeMap maintains natural order. With numbers this is 1,2,3,4... With Strings this is a,b,c,d,e.....
		
		TreeMap<String, String> treeMap = new TreeMap<String, String>(dictionary);
		
		// If I would iterate through this, all the KEYS will be sorted based on the alphabet. 
		
		for (Map.Entry<String, String> entry : treeMap.entrySet()) {
			System.out.print(entry.getKey() + " - ");
			System.out.println(entry.getValue());
		}
	}
}
