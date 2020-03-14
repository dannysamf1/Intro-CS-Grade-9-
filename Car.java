class Car{
	static int wheels = 4;
	static boolean is_registered = true;

	private String model;
	private String color;
	private boolean selfdriving;


	public Car (String a, String b, boolean c){
		model = a;
		color = b;
		selfdriving = c;
		System.out.println("The Car is a: " + model);
	}

	public String getModel(){
		return model;
	}

	public String getColor(){
		return color;
	}

	public Boolean getSelfDriving(){
		return selfdriving;
	}
}