package basic.classesObjects;
 class Animal {
	 public void animalSound() {
		System.out.println("each animal makes different sound");
	}
 }
 class Cat extends Animal{
	 public void animalSound() {
		System.out.println("meow...meow...");
	}
 }
class Lion extends Animal{
	public void animalSound() {
		System.out.println("Roar....Roar....");
	}
}
 class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Animal objanim=new Animal();
       Animal objcat=new Cat();
       Animal objLion=new Lion();
       objanim.animalSound();
       objcat.animalSound();
       objLion.animalSound();
	}

}
