public class Design{
	public static void main(String[] args){
		System.out.println(And(true, false));
		System.out.println(hello("GUADSFAFA"));
	}

	public static boolean And(boolean x, boolean y){
		if (x== true){
			if (y==true){
				return true;
			}
		}
			return false;
		}
	public static String hello(String name){
		if (name.length() < 5){
			return name;
		}
		return "thats not your " + name;
	}
}	