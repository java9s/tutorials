import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExec {
	public static void main(String[] args) {
		TreeSet<Car> treeSet = new TreeSet<Car>();
		
		for(int i =0; i<100; i++){
			treeSet.add(new Car("H-"+i));
		}
		
		Iterator<Car> carIterator = treeSet.iterator();
		while(carIterator.hasNext()){
			System.out.println(carIterator.next());
		}
	}
}
