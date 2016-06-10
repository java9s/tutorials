import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExec {
	public static void main(String[] args) {
		HashMap<Car, Owner> carOwners = new HashMap<Car, Owner>();
		
		for(int i=0; i<100; i++){
			carOwners.put(new Car("H-"+i), new Owner());
		}
		
		Iterator<Car> carIterator = carOwners.keySet().iterator();
		while(carIterator.hasNext()){
			Car c = carIterator.next();
			System.out.println(c+" Owner:"+carOwners.get(c));
		}
		
	//EntrySet
	System.out.println("=========");
		System.out.println("Map Entry");
		System.out.println("=========");
		Set<Map.Entry<Car, Owner>> mapEntries = carOwners.entrySet();
		Iterator<Map.Entry<Car, Owner>> mapEntryItr = mapEntries.iterator();
		while(mapEntryItr.hasNext()){
			Map.Entry<Car, Owner> carEntry = mapEntryItr.next();
			System.out.println("Key:"+carEntry.getKey()+"  Value:"+carEntry.getValue());
		}

	}
}
