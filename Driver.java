package Assign7;


public class Driver {

	public static void main(String[] args) {
			ArraySortedList<Integer> lst = new ArraySortedList<Integer>(5);
			lst.add(6);
			lst.add(2);
			lst.add(5);
			lst.add(5);
			lst.add(5);
			lst.add(8);
			lst.add(1);
			System.out.println(lst);
			System.out.println("Removing 8, Found: " + lst.removeALL(8));
			System.out.println("Removing 5, Found: " + lst.removeALL(5));
			System.out.println("List: " + lst);
			
			//============================================================
			
			LinkedSortedList<Integer> linkLst = new LinkedSortedList<Integer>();
			linkLst.add(6);
			linkLst.add(8);
			linkLst.add(8);
			linkLst.add(2);
			linkLst.add(9);
			System.out.println("\n" + linkLst);
			System.out.println("Removing 6, Found: " + linkLst.removeALL(6));
			System.out.println("List: " + linkLst);	
	}

}
