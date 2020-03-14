public class Hey{
	public static void greet(String name){
		System.out.println("Hello " + name + "!");
	}

	public static int max(int x, int y){
		if(x>y){
			return x;
		}
		else{
			return y;
		}
	}
	public static void main(String[] args){
		System.out.println("HELLO WORLD!");
		int myFavoriteNumber;
		myFavoriteNumber = 4+5;
		System.out.println("Hello. My favorite number is " + myFavoriteNumber);

		greet("Iron Man");
		greet("Captain America");

		System.out.println(max(3,5));
	}
}





