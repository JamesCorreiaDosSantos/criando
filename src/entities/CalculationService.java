package entities;

import java.util.List;

public class CalculationService {

	  public static <T extends Comparable<? super T>> T max(List<T> list){
		  
		  if(list.isEmpty()) {
			  throw new IllegalStateException("List cant be empty");
		  }
		  
		  T max = list.get(0);
		  
		  for(T items : list) {
			  if(items.compareTo(max) > 0) {
				  max = items;
			  }
		  }
		  return max;
		  
	  }
   
}