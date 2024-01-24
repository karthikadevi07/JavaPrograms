package collectionprogram;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
public class MapProgram {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("In", "India");
		map.put("Br", "Brazil");
		map.put("Fr", "France");
		map.put("De", "Germany");
		map.put(null, null);
		System.out.println("Implementing HashMap: ");
		for(Map.Entry<String, String> entry : map.entrySet())
		{
			System.out.println("Country Code: "+entry.getKey()+", Country: "+entry.getValue());
		}
		System.out.println(map.get("Br"));
		Map<String, String> treeMap=new TreeMap<>();
		treeMap.put("BR01", "Coffee");
		treeMap.put("TE06", "Tea");
		treeMap.put("PS29", "Pasta");
		System.out.println("Implementing TreeMap: ");
		for(Map.Entry<String, String> entry:treeMap.entrySet())
		{
			System.out.println("Code: "+entry.getKey()+", Menu: "+entry.getValue());
		}
		Hashtable<String, String> hashTable=new Hashtable<>();
		hashTable.put("BR01", "Coffee");
		hashTable.put("TE06", "Tea");
		hashTable.put("PS29", "Pasta");
		System.out.println("Implementing HashTable: ");
		for(Map.Entry<String, String> entry:hashTable.entrySet())
		{
			System.out.println("Code: "+entry.getKey()+", Menu: "+entry.getValue());
		}


	}

}
