package problem;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Problem1 {

	public static void main(String[] args) {
		List<Integer> ls1 = Arrays.asList(1,2,3,4,5);
		List<Integer> ls2 = Arrays.asList(1,4,5,7,9);
		
		Stream<Integer> full = Stream.concat(ls1.stream(),ls2.stream());
		List<Integer> allElements = full.collect(Collectors.toList());
	    System.out.println("all elements :"+allElements);
	    
	    Set<Integer> uniqueElements = allElements.stream().collect(Collectors.toSet());
	    System.out.println("unique elements :"+uniqueElements);
	    
	    Integer min = uniqueElements.stream().min((x1,x2)-> x1 - x2).get();
	    Integer max = uniqueElements.stream().max((x1,x2)-> x1 - x2).get();
	    System.out.println("max :"+max);
	    System.out.println("min :"+min);

 	}

}
