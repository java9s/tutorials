import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExec{
	public static void main(String[] args) {
		LinkedHashSet<Car> linkedHashSet = new LinkedHashSet<Car>();
		
		for(int i=0;i<100;i++){
			linkedHashSet.add(new Car("H-"+i));
		}
		
		Iterator<Car> carIterator = linkedHashSet.iterator();
		
		while (carIterator.hasNext()) {
			Car c= carIterator.next();
			carIterator.remove();
		}
		System.out.println(linkedHashSet.add(new Car("H-0")));
		System.out.println(linkedHashSet.size());
	}
}
