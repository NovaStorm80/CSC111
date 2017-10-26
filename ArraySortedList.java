package Assign7;
import java.util.Comparator;

public class ArraySortedList<T> {
	private T[] list;
	private Comparator<T> comp;
	private int numItems;
	
	public ArraySortedList(int cap){
		list = (T[]) new Object[cap];
		numItems = 0;
		comp = null;
	}
	
	public ArraySortedList(Comparator<T> c){
		list = (T[]) new Object[10];
		numItems = 0;
		comp = c;
	}
	

	public void add(T item){
		if(numItems == list.length) return;
		int where = -1;
		//first step: find insertion point
	//	if(comp != null){
		//	for(int i=0; i< numItems; i++) {
		//		comp.compare(list[i], item);
		//		System.out.println("true");
		//	}
		//}
	//	else {
			for(int i=0; i < numItems; i++){
				
				if( ((Comparable<T>) list[i]).compareTo(item) < 0){
					//where++;
				}
				else{
					where = i;
					break;
				}
			}
			//Second step: create an EMPTY space
			if (where == -1){
				list[numItems] = item;
				numItems++;
				return;
			}
				
			for(int i = numItems; i > where; i--){
				list[i] = list [i-1];
				
			}
			//3. Insert Item
			list[where] = item;
			numItems++;
	//	}
	}
	
	public void remove(T item){
		int where = -1;
		for(int i=0; i < numItems; i++){
			if(list[i].equals(item)){
				where = i;
			}
		}
		if (where == -1) return;
		for(int i = where; i < numItems - 1; i++){
			list[i] = list[i+1];
		}
		numItems--;
	}
	
	public int removeALL(T element) {
		int numRemoved = 0;
		for(int i=0; i < numItems; i++) {
			if(list[i] == element) {
				for(int j = i; j < numItems; j++) {
					if(j+1 == numItems) {
						list[j] = null;
					}
					else {
						list[j] = list[j+1];
					}
				}
				numItems--;
				numRemoved++;
				i--;
			}
		}
		
		
		return numRemoved;
	}
	
	public String toString(){
		String str = "";
		for(int i=0; i < numItems; i++){
			str += list[i] + " ";
		}
		
		return str;
	}

}
