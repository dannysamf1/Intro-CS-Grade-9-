public class While{
	public static void main(String[] args){
		hello(5);
		System.out.println(Hey(5));
		as(5);
		System.out.println(a(5));
		hei(5);
		whie(5);
	}
	public static void hello(int x){
		int y= 1;
		int z = 1;
		while(x>=z){
			y = y*z;
			z = z+1;
		}
		System.out.println(y);
	}
	public static int Hey(int x){
		int z = 1;
		for(int i = 1; i <= x; i+=1){
			z=z*i;
		}
		return z;
	}
	public static void as(int y){
		int z = 1;
		int x= 1;
		while(y>=z){
			x = x*z;
			z = z+1;
		}
		System.out.println(x);
	}

	public static int a(int y){
		int z = 1;
		for(int i= 1; i<=y; i+=1){
			z= z*i;
		}
		return z;
	}

	public static void hei(int y){
		int x=1;
		int z= 1;
		while(y>=x){
			z = z*x;
			x = x+1;
		}
		System.out.println(z);
	}
	public static int whie(int y){
		int z = 1;
		int x = 1;
		while(y>=z){
			z = z*x;
			x= x+1;
		}
		return z;
	}
}

