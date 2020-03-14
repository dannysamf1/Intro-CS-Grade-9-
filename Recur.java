public class Recur{
	public static void main(String[] args){
		System.out.println(wile(5));
	}
	public static int wile(int y){
		int num = 1;
		int x= 1;
		while(y>=1){
			num = num*x;
			x= x+1;
		}
		return num;
	}
}