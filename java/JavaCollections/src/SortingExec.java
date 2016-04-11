import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingExec {
	public static void main(String[] args) {
		ArrayList<Car> carsList = new ArrayList<Car>();
		
		for(int i=0; i< 100 ;i++){
			Car c = new Car("H-"+i);
			c.setPrice((int)(Math.random()*100)+1);
			carsList.add(c);
		}
		
		Iterator<Car> carIterator = carsList.iterator();
		while(carIterator.hasNext()){
			Car c = carIterator.next();
			System.out.println(c+" Price :"+c.getPrice());
		}
		//Sorting based on natural criteria.
		
		Collections.sort(carsList);
		System.out.println("After Sorting---------------------");
		
		
		Iterator<Car> afterSortIterator = carsList.iterator();
		while(afterSortIterator.hasNext()){
			Car c = afterSortIterator.next();
			System.out.println(c +" Price :"+c.getPrice());
		}
		
		
		
		
		//Custom comparator
		System.out.println("Custom comparision -----------");
		Collections.sort(carsList, new CustomComparator());
		
		Iterator<Car> customCompIterator = carsList.iterator();
		while(customCompIterator.hasNext()){
			Car c = customCompIterator.next();
			System.out.println(c+"Price :"+c.getPrice());
		}
	}
}
