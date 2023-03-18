package lsp;

public class rectangle implements shape {
	
	private int length;
	private int  breadth;
	public rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public int getArea() {
		return this.length* this.breadth;
	}
	

}
