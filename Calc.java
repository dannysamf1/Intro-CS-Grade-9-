public class Calc{
	public static void main(String[] args){
		System.out.println(Multiply(3,4));
		System.out.println(Divide(12,2));
		System.out.println(Add(3,4));
		System.out.println(Sub(12,2)); 
	}
	public static int Multiply(int x, int y){
		return x*y;
	}
	public static int Divide(int x, int y){
		return x/y;
	}
	public static int Add(int x, int y){
		return x+y;
	}
	public static int Sub(int x, int y){
		return x-y;
	}
}