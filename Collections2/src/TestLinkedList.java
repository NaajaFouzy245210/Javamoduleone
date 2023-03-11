package listDemo;
import java.util.LinkedList;
public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("marker");
		list.add("pencil");
		list.add("book");
		list.add("eraser");
		list.add("sharpner");
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(2));
		list.add(2,"sticky notes");
		System.out.println(list);
		
	}

}
