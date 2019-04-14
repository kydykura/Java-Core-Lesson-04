package ua.lviv.lgs;

public class Animals {

		private String nameAnimal;
		private int speedAnimal;
		private int age;
		
		Animals(String nameAnimal,int speedAnimal,int age){
			this.age = age;
			this.nameAnimal = nameAnimal;
			this.speedAnimal = speedAnimal;
		}

		public String getNameAnimal() {
			return nameAnimal;
		}

		public int getSpeedAnimal() {
			return speedAnimal;
		}

		public int getAge() {
			return age;
		}

		public void setNameAnimal(String nameAnimal) {
			this.nameAnimal = nameAnimal;
		}

		public void setSpeedAnimal(int speedAnimal) {
			this.speedAnimal = speedAnimal;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
}
