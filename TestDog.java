/* 
 * SFHS ~ 2019-2020 
 * Intro CS ~ Mrs. Vollucci
 * Mini-Lab 5.3
 */

// Make sure both Dog.java & this file are in the same place (either Downloads or Desktop)

class TestDog {
	public static void main(String[] args) {
		// This is where you will create your Dog objects.
		// This is the file you need to compile & run.
		Dog mydog = new Dog("Wendell", 3, "Corgi");
		mydog.getAge();
		System.out.println(mydog.getBreed());
		mydog.speak();

		Dog mystery = new Dog("Scooby Doo", 48, " Great Dane");
		mystery.getAge();
		System.out.println(mystery.getBreed());
		mystery.speak();

		Dog what = new Dog("Danny", 14, "Human");
		what.getAge();
		System.out.println(what.getBreed());
		what.speak();

		Dog hello = new Dog("Kim", 14, "Dog");
		hello.getAge();
		System.out.println(hello.getBreed());
		hello.speak();


}
}

