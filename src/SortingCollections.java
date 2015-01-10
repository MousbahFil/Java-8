import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortingCollections {
 public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("Hy"); list.add("Hello"); list.add("My"); list.add("Adsl");
	
	
	Comparator<String> myComparator = (o1,o2) ->{return -o1.compareTo(o2);};
	Collections.sort(list, myComparator);
	list.forEach(p ->{
		System.out.println(p);
	});
}
}
