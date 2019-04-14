package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		
		Robot r = new Robot();
		CoffeRobot c = new CoffeRobot();
		RobotCoocker rc = new RobotCoocker();
		System.out.println(r);
		System.out.println(c);
		System.out.println(rc);
		Object mass[] = {r, c, rc};
		for (int i=0; i<=2; i++) {
			System.out.println(mass[i]);
		}
		
		Wheel w = new Wheel(2, 5, 8);
		Helm h = new Helm(25, "black & ");		
		Body b = new Body("white", "crosover");
		Auto a = new Auto("VW", "Passat B6", 2015, b, w, h);
		System.out.println(a);
		
		Animals an = new Animals("�������", 20, 7);
		System.out.println("����� ������� = " + an.getNameAnimal() + 
				", " + "�������� ������� = " + an.getSpeedAnimal() + 
				" ��/���, " + "³� ������� = " + an.getAge() + " ����");
		an.setNameAnimal("������");
		an.setSpeedAnimal(90);
		an.setAge(4);
		System.out.println("����� ������� = " + an.getNameAnimal() + 
				", " + "�������� ������� = " + an.getSpeedAnimal() + 
				" ��/���, " + "³� ������� = " + an.getAge() + " ����");
		
	}

}
