public class Untitled{
	public static void main(String[] args){
		System.out.println(every_other("java"));
	}
	public static String every_other(String y){
		String x = "";
		for(int i =0; i<y.length(); i++){
			if(i%2 ==0){
				x+=y.charAt(i);
			}
		}
		return x;
	}
}