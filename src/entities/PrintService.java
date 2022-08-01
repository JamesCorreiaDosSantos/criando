package entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService <T>{

	List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if(list.isEmpty()) {
			throw new IllegalStateException();
		}else {
			return list.get(0);
		}
	}
	
	public void print() {
		for(T x : list) {
			System.out.println(x + ", ");
		}
	}
	
	
}
