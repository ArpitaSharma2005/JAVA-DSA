import java.util.*;
public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String> ();
		al.add("Arpita");
		al.add("Ekta");
		al.add("Ayush");
		al.add("Ajit");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
