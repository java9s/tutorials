import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExec {
	public static void main(String[] args) {
		ArrayList<Car> carsList = new ArrayList<Car>();
		
		Car c = new Car("H234");
		
		carsList.add(c);
		
		System.out.println(carsList.size());
		
		//add(int index, E e)
		for(int i=0; i<5; i++){
			carsList.add(new Car("H"+i));
		}

		carsList.add(4, new Car("H345"));
		
		//Iterator
		Iterator<Car> carIterator = carsList.iterator();
		while(carIterator.hasNext()){
			System.out.println(carIterator.next());
		}
		
		//Clone method
		ArrayList<Car> carsList2 = (ArrayList<Car>)carsList.clone();
		
		Iterator<Car> carsIterator2 = carsList2.iterator();
		while (carsIterator2.hasNext()) {
			System.out.println("----"+carsIterator2.next());
		}
		
		
		//Contains(Object o)
		System.out.println(carsList.contains(new Car("H234")));
		
		//get(int index)
		System.out.println(carsList.get(4));
		
		
		
	//	if(carsList.size() == 0) // Bad practice 
			//use
			//if(carsList.isEmpty()){}
		
		//Loop and size
		//for(int i =0; i<carsList.size(); i++){} //Bad Practice
		//for(int i =0 , n = carsList.size(); i<n ; i++){}//Good to get the size and have in a local variable
		
		
		//indexOf(Object o)
		System.out.println(carsList.indexOf(new Car("H4")));
		
		
		ArrayList<Car> carsList3 = new ArrayList<Car>();
		carsList3.ensureCapacity(300);
		long startTime = System.nanoTime();
		for(int i =0; i<100; i++){
				carsList3.add(new Car("H"+(i+10)));
		}
		System.out.println("Elapsed Time - no ENSURE CAPACITY- "+( System.nanoTime()-startTime));
	}
}
