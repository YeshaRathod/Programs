package collection_Examples;
import java.util.*;
public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> a1 = new ArrayList<Integer>();
		
		ArrayList <String> ListWeek = new ArrayList<String>();
		ArrayList  ListWeek1 = new ArrayList<>();//you can add any type of data
		
		ListWeek.add("Sunday");
		ListWeek.add("MOnday");
		ListWeek.add("Tuesday");
		ListWeek.add("Wednesday");
		
		
		a1.add(12);
		a1.add(1);
		a1.add(14);
		a1.add(15);
		a1.add(16);
		
		System.out.println(ListWeek);
		
		/*Iterator  i1 =  a1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}*/
		
		Iterator read = ListWeek.iterator();
		while(read.hasNext()) {
			System.out.println(read.next());
		}
		
		
		 a1.forEach((n) -> System.out.println(n));
	}

}