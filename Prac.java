public class Prac{
	public static void main(String[] args){
		System.out.println(prod2num(3));
		System.out.println(forloop(3));
	}
	public static int prod2num(int y){
		int index = 1;
		for(int i=1; i<=y; i+=1){
			index = index*i;
		}
		return index;
	}

	public static int forloop(int x){
		int a = 1;
		for(int i =1; i<=x; i+=1){
			a = a*i;
		}
		return a;
	}
	public static void whileloop(int z){
		int y = 1;
		int product = 1;
		while(z>y){
			product = y*product;
			y = y+1
			
		}
		System.out.println()
	}
}