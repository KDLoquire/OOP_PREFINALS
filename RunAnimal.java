import java.util.Scanner;

public class RunAnimal {
	public static void main (String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.print("Choose an animal. Press B for Bird, C for Cat and D for Dog: ");
	String choose = input.nextLine();
	
	if (choose.equalsIgnoreCase("B")){
		Bird b = new Bird();
		b.eat();
		b.sleep();
		b.makeSound();
	}
	if (choose.equalsIgnoreCase("C")){
		Cat c = new Cat();
		c.eat();
		c.sleep();
		c.makeSound();
	}
	if (choose.equalsIgnoreCase("D")){
		Dog d = new Dog();
		d.eat();
		d.sleep();
		d.makeSound();
	}
}
}