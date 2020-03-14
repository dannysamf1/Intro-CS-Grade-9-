class Dog{
	static boolean isMammal = true;
	static String phrase = "Woof!";

	private String name;
	private int age;
	private String breed;
	private String rating;
	

	public Dog(String n, int a, String b){
		name = n;
		age = a;
		breed = b;

		System.out.println("Dog Name: " + name);
	}

	public String getBreed(){
		return "Breed Type: "+ breed;
	}
	public void getAge(){
		System.out.println("Dog age: " + age);
	}
	public void speak(){
		System.out.println(phrase);
	}
	

}