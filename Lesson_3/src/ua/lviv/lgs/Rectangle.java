package ua.lviv.lgs;

public class Rectangle {
	private int length; 
	private int width;


	Rectangle (int length, int width) {
		this.length = length;
		this.width = width;
	}
	Rectangle (){
		length=3;
		width=8;
	}

	@Override
	public String toString() {
		return "squareRectangle=" + length*width + ", perimetrRectangle=" + (width + length)*2;
	}
	
}