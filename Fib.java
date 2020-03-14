public class Fib{
	public static void main(String[] args){
		System.out.println(fib(10));
	}
	public static int fib(int x){
		if (x==0){
			return 0;
		}
		if (x==1){
			return 1;
		}
		return (fib(x-1)+fib(x-2));
	}
}