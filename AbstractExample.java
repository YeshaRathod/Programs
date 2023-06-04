package example_2;

public class AbstractExample {
     public static void main(String[] args)
     {
    	 Animal dog = new Dog("Max",5);
    			 dog.makeSound();
    	 
    	 Animal cat = new Cat("Sweety",3);
                 cat.makeSound();   	 
    	 
     }
}
abstract class Animal{
	String name;
	int age;
	
	public Animal(String n , int a)
	{
		this.name=n;
		this.age=a;
	}
	
	abstract void makeSound(); 
}
class Dog extends Animal{
	public Dog(String n , int a) {
	    super(n,a);
	}
	void makeSound() {
		System.out.println("The Dog "+ name +"is Barking");
	}
	
}
class Cat extends Animal{
	public Cat(String n, int a) {
		super(n,a);
	}
	void makeSound()
	{
		System.out.println("Cat "+ name +" meowww....meowww...");
	}
}
