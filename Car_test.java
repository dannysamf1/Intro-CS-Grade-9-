class Car_test{
	public static void main(String[] args){
		Car tesla = new Car ("Model X", "White", true);
		System.out.println(tesla.getModel());
		System.out.println(tesla.getColor());
		System.out.println(tesla.getSelfDriving());

		Car toyota = new Car("Rav 4", "Space Gray", false, "Good");
		System.out.println(toyota.getColor());
	}
}