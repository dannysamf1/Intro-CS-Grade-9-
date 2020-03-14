public class xx{
	public static void main(String[] args){
		System.out.println(hello(5));
		System.out.println(hel(5));
	}
	public static int hello(int y){
		int z = 1;
		int x = 1;
		while(y>=z){
			x = x*z;
			z = z+1;
		}
		return x;
	}
	public static int hel(int y){
		int z = 1;
		for (int i = 1; i <=y; i+=1){
			z= z*i;
		}
		return z;
	}
}