package Assign7;



public class LinkedSortedList<T> {
	private Node<T> head;
	private int items;
	
	
	public LinkedSortedList(){
		head = null;
		items = 0;
		
	}

	public void add(T item){
		Node<T> newNode = new Node<T>(item);
		Node<T> cursor = head, precursor = null;
		while(cursor != null){
			if(((Comparable<T>) cursor.getInfo()).compareTo(item) < 0 ){
				precursor = cursor;
				cursor = cursor.getLink();
			}
			else{
				break;
			}
		}
		newNode.setLink(cursor);
		if(precursor == null){
			head = newNode;
		}
		else{
		precursor.setLink(newNode);
		}
		items++;
	}
	
	public void remove(T item){
		Node<T> cursor = head, precursor = null;
		while(cursor != null){
			
			if(cursor.getInfo().equals(item)){
				break;
			}
			else{
				precursor = cursor;
				cursor = cursor.getLink();
			}
		}
		if(precursor == null){
			head = head.getLink();
		}
		else if(cursor == null) return;
		else{
		precursor.setLink(cursor.getLink());
		}
		items--;
	}
	
	public int removeALL(T element) {
		int numRemoved = 0;
		int where = 0;
		Node<T> cursor = head, precursor = null;
		for(int i = 0; i < items; i++) {
			while(cursor != null){
				if(cursor.getInfo().equals(element)){
					where = 1;
					break;
				}
				else{
					precursor = cursor;
					cursor = cursor.getLink();
				}
			}
			if(precursor == null){
				head = head.getLink();
			}
			if (where == 1) {
				precursor.setLink(cursor.getLink());
				numRemoved++;
			}
					
		}
		return numRemoved;
	}
	
		
	public String toString(){
		String str = "";
		Node<T> cursor = head;
		while(cursor != null){
			str += cursor.getInfo().toString() + " ";
			cursor = cursor.getLink();
		}
		
		return str;
	}

}

class Node<T>{
	private T info;
	private Node<T> link;
	
	public Node(T i){
		info = i;
		link = null;
	}
	
	public Node(Node<T> l, T i){
		info = i;
		link = l;
	}
	public Node(){
		info = null;
		link = null;
	}
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	public Node<T> getLink() {
		return link;
	}
	public void setLink(Node<T> link) {
		this.link = link;
	}	
}
