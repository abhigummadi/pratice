 
package Basic1;

import java.util.Arrays;

//T ->Generics

public class OurList<T> {
	
	//object[] bez it must be able to store anykind of object
	private Object[] values=new Object[2];
	private int counter=0;
	
	public void add(T obj) {
		if(counter==values.length) {
			values=Arrays.copyOf(values, values.length*2);
		}
	values[counter]=obj;
		counter++;
		}
	
	public T get(int index) {
		return (T)values[index];
	}
	
	public void remove(int index) {
		for(int i=index;i<counter;i++) {
			values[i]=values[i+1];
			values[counter]=null;
			counter--;
		}
		
	}
	
	public int size() {
		return counter;
	}
	
	public int listSize() {
		return values.length;
	}
	
	

}