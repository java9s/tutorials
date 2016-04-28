import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExec {
	public static void main(String[] args) {
		PriorityQueue<Car> carsQueue = new PriorityQueue<Car>();
		
		//adding the elements
		for(int i =0; i<100; i++){
			Car c = new Car("H-"+i);
			c.setPrice((int)(Math.random()*100)+1);
			carsQueue.offer(c);
		}
		
		//peek()
		System.out.println(carsQueue.peek());
		
	//Iterating through the elements
		Iterator<Car> carIterator = carsQueue.iterator();
		while(carIterator.hasNext()){
			Car c = carIterator.next();
			System.out.println(c+" Price -"+c.getPrice());
		}
		
	//Contains
		Car x = new Car("H-9");
		System.out.println(carsQueue.contains(x));
		
		//poll
		while(carsQueue.size()>0){
			Car c = carsQueue.poll();
			System.out.println(c+" Price:"+c.getPrice());
		}
		
		System.out.println("SIZE:"+carsQueue.size());
		//Thread safe priority queue
		PriorityQueue<Car> tsafeQueue = (PriorityQueue<Car>)Collections.synchronizedCollection(new PriorityQueue<Car>());
	}
}
