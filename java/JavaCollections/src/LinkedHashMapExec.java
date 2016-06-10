import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExec {
	public static void main(String[] args) {
		LinkedHashMap<Car, Owner> cars = new LinkedHashMap<Car, Owner>();
		
		for(int i=0; i<10; i++){
			cars.put(new Car("H-"+i), new Owner());
		}
		
		LinkedHashMapExec.mapIterator(cars);
		
		System.out.println("HashMap=====");
		HashMap<Car, Owner> hashMap = new HashMap<Car, Owner>();
		hashMap.putAll(cars);
		
		LinkedHashMapExec.mapIterator(hashMap);
		
	System.out.println("Access Order===");
		LinkedHashMap<Car, Owner> carsOrder = new LinkedHashMap<Car, Owner>(10, 2.1f, true);
		carsOrder.putAll(cars);
		
		LinkedHashMapExec.mapIterator(carsOrder);

	System.out.println("After access===");
		carsOrder.get(new Car("H-5"));
		LinkedHashMapExec.mapIterator(carsOrder);
	}
	
	public static void mapIterator(Map<Car, Owner> map){
		Iterator<Map.Entry<Car, Owner>> itr = map.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<Car, Owner> entry = itr.next();
			System.out.println(entry.getKey()+" Owner:"+entry.getValue());
		}
	}
}
