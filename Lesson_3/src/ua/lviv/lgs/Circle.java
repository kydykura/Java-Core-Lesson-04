package ua.lviv.lgs;

public class Circle {
	private double radius;
	private double diameter;
	
	Circle (double radius, double diameter){
		this.radius=radius;
		this.diameter=diameter;
	}
	@Override
	public String toString() {
		return "squareCircle=" + Math.PI*Math.pow(diameter, 2)/4 + "  lengthCircle=" + 2*Math.PI*radius;
	}
	
	
}
