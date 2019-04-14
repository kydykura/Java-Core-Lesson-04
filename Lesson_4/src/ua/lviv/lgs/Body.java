package ua.lviv.lgs;

public class Body {

	private String colorBody;
	private String typeBody;
	
	Body(String colorBody, String typeBody) {
		this.colorBody = colorBody;
		this.typeBody = typeBody;
		
	}

	@Override
	public String toString() {
		return "Body [colorBody=" + colorBody + ", typeBody=" + typeBody + "]";
	};
	
}
