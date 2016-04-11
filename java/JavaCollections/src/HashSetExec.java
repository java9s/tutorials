import java.util.HashSet;
import java.util.Iterator;

public class HashSetExec {
	public static void main(String[] args) {
		HashSet<Car> hashSet = new HashSet<Car>();
		
		for(int i=0; i<100;i++){
			hashSet.add(new Car("H-"+i));
		}
		
		Iterator<Car> carIterator = hashSet.iterator();
		while(carIterator.hasNext()){
			System.out.println(carIterator.next());
		}
		
		System.out.println(hashSet.add(new Car("H-0")));
	}
}
