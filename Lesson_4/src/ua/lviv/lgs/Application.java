package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		
		Robot r = new Robot();
		CoffeRobot c = new CoffeRobot();
		RobotCoocker rc = new RobotCoocker();
		RobotDancer rd = new RobotDancer();
		r.work();
		c.work();
		rc.work();
		rd.work();
		
		Object mass[] = {r,c,rc,rd};
		for (int i=0;i<=3;i++) {
			((Robot) mass[i]).work();
		}
	
		
		Wheel w = new Wheel(2, 5, 8);
		Helm h = new Helm(25, "black & ");		
		Body b = new Body("white", "crosover");
		Auto a = new Auto("VW", "Passat B6", 2015, b, w, h);
		System.out.println(a);
		
		Animals an = new Animals("Леопард", 20, 7);
		System.out.println("Назва тварини = " + an.getNameAnimal() + 
				", " + "Швидкість тварини = " + an.getSpeedAnimal() + 
				" км/год, " + "Вік тварини = " + an.getAge() + " років");
		an.setNameAnimal("Гепард");
		an.setSpeedAnimal(90);
		an.setAge(4);
		System.out.println("Назва тварини = " + an.getNameAnimal() + 
				", " + "Швидкість тварини = " + an.getSpeedAnimal() + 
				" км/год, " + "Вік тварини = " + an.getAge() + " років");
		
	}

}
