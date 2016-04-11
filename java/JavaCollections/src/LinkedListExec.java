import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExec {
	public static void main(String[] args) {
		LinkedList<Car> linkedList = new LinkedList<Car>();
		
		for(int i=0; i<100; i++){
			linkedList.add(new Car("H"+i));
		}
		
		linkedList.addFirst(new Car("H-First"));
		linkedList.addLast(new Car("H-Last"));
		

		
		linkedList.removeLast();
		linkedList.removeFirst();
		
		linkedList.pollFirst();
		linkedList.pollLast();
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		
		Iterator<Car> carLastIterator = linkedList.descendingIterator();
		while(carLastIterator.hasNext()){
			System.out.println(carLastIterator.next());
		}
	}

}
