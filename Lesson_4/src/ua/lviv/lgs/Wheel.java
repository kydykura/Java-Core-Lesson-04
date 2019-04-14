package ua.lviv.lgs;

public class Wheel {

	
	private int standartDiametrWhile;
	private int standartWidthWhile;
	private int standartProfileWhile;
	
	Wheel(int diameterWheel, int widthWheel, int profileWheel){
		this.standartDiametrWhile = diameterWheel;
		this.standartWidthWhile = widthWheel;
		this.standartProfileWhile = profileWheel;
		
		
		
		standartDiametrWhile+=standartDiametrWhile;
		standartWidthWhile+=standartWidthWhile;
		standartProfileWhile+=standartProfileWhile;
	}

	@Override
	public String toString() {
		return "Wheel [standartDiametrWhile=" + standartDiametrWhile + ", standartWidthWhile=" + standartWidthWhile
				+ ", standartProfileWhile=" + standartProfileWhile + "]";
	}
		
}
	