
public class Hello{
	public static void greet(String name){
		System.out.println("Hello" + name + "!");

	}
	public static int max(int x, int y){
		if(x > y){
			return x;
		}
		else{
			return y;

			}
		}


	public static void main(String[] args){
		System.out.println("Hello World");
		int myFavoriteNumber;
		myFavoriteNumber = 4+5;
		System.out.println("Hello. My favorite number is " + myFavoriteNumber);


		greet(" Iron man");
		greet(" Captain America"); 

		System.out.println(max(3,5));
		System.out.println(max(4,-1));
	}
}
