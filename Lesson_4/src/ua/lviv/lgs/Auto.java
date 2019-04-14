package ua.lviv.lgs;

public class Auto {
	private String concern;
	private String model;
	private int yahr;
	private Body body;
	private Wheel wheel;
	private Helm helm;
	
	public Auto(String concern, String model, int yahr, Body body, Wheel wheel, Helm helm) {
		this.body = body;
		this.concern = concern;
		this.helm = helm;
		this.wheel = wheel;
		this.model = model;
		this.yahr = yahr;
	}

	@Override
	public String toString() {
		return "Auto [concern=" + concern + ", model=" + model + ", yahr=" + yahr + ", body=" + body + ", wheel="
				+ wheel + ", helm=" + helm + "]";
	}
	
}
