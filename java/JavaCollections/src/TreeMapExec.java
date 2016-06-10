import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExec {
	public static void main(String[] args) {
		TreeMap<Car, Owner> carOwners = new TreeMap<Car, Owner>();
		
		for(int i = 0; i < 100; i++){
			Car c = new Car("H-"+i);
			c.setPrice((int)(Math.random()*100)+1);
			carOwners.put(c, new Owner());
		}
		
		TreeMapExec.mapIterator(carOwners);
				
	System.out.println("First Entry: "+carOwners.firstEntry());
		System.out.println("First Key : "+carOwners.firstKey());	
		System.out.println("Last Entry: "+carOwners.lastEntry());
		System.out.println("Last Key: "+carOwners.lastKey());
		

		System.out.println(carOwners.pollFirstEntry());
		System.out.println(carOwners.pollLastEntry());
		
		TreeMapExec.mapIterator(carOwners);

		System.out.println("Higher Entry: "+carOwners.higherEntry(new Car("H-1000",40)));
		System.out.println("Lower Entry: "+carOwners.lowerEntry(new Car("H-1000",40)));
		

		System.out.println("Head Map==");
		Map<Car, Owner> headMap = carOwners.headMap(new Car("H-1000", 40));
		TreeMapExec.mapIterator(headMap);

		
		System.out.println("Tail Map==");
		Map<Car, Owner> tailMap = carOwners.tailMap(new Car("H-1000", 40));
		TreeMapExec.mapIterator(tailMap);
		
		System.out.println("Price Filter ---- Cars with price between 30 to 80");
		Map<Car,Owner> priceFilterMap = carOwners.tailMap(new Car("H-200", 30)).headMap(new Car("H-300", 80));
		TreeMapExec.mapIterator(priceFilterMap);
		
	SortedMap<Car,Owner> threadSafeMap = Collections.synchronizedSortedMap(new TreeMap<Car,Owner>());
		System.out.println("Custom order");
		 TreeMap<Car, Owner> customOrderMap = new TreeMap<Car, Owner>(new CustomComparator());
		 customOrderMap.putAll(carOwners);
		 TreeMapExec.mapIterator(customOrderMap);
		 }
	
	public static void mapIterator(Map<Car, Owner> map){
		Iterator<Map.Entry<Car, Owner>> mapItr = map.entrySet().iterator();
		while(mapItr.hasNext()){
			Map.Entry<Car, Owner> entry = mapItr.next();
			System.out.println("Car:"+entry.getKey()+" Price:"+entry.getKey().getPrice()+" Owner:"+entry.getValue());
		}
	}
}
