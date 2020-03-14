public class Quiz{
	public static void main(String[] args){
		System.out.println(max(3,4,5));
		System.out.println(productofSum(4,6));
		System.out.println(strRecur("HELLo", 3));
	}
	public static int max(int x, int y, int z){
		if(x>=y && x>=z){
			return x;
		}
		if (z>=x && z>=y){
			return z;
		}
		else{
			return y;
		}
	}

	public static int productofSum(int x, int y){
		int z = 1;
		for (int i = x; i<=y; i++){
		z = z*(i+i);
		}
		return z;
	}
	public static String strRecur(String input, int num){
		if(num==1){
			return input;
		}
		else{
			return input + "*" + strRecur(input, num - 1);
		}
	}
}