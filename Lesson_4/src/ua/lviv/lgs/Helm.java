package ua.lviv.lgs;

public class Helm {

	private int standartDiameterHelm;
	private String standartColor;
	
	
	Helm(int diameterHelm, String color){
		this.standartDiameterHelm = diameterHelm;
		this.standartColor = color;
	
				
		standartDiameterHelm += 5;
		standartColor += "white";
	}


	@Override
	public String toString() {
		return "Helm [standartDiameterHelm=" + standartDiameterHelm + ", standartColor=" + standartColor + "]";
	}
	
}
