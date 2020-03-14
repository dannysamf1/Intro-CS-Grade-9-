import java.lang.Math;
class TypesConditions {
  public static void main(String[] args) {
    // Add code here to test your methods
   

   System.out.println(andOP(true, true));
   System.out.println(andOP(true, false));
   System.out.println(orOP(false, true));
   System.out.println(orOP(false, false));
   System.out.println(evenoddlength("java"));
   System.out.println(evenoddlength("testing"));
   System.out.println(sumDouble(7,7));
   System.out.println(sumDouble(3,9));
   System.out.println(sumDouble(11,11));

   System.out.println(makes100(89,100));
   System.out.println(makes100(63,37));
   System.out.println(makes100(99,2));
   System.out.println(closeto100(90));
   System.out.println(closeto100(208));
   System.out.println(closeto100(89));
   System.out.println(closeto100(191));
    // Problem 7 Tests here
  }
  
  public static boolean andOP (boolean A, boolean B) {
    if (A== true){
      if(B==true){
        return true;
      }
    }
    return false;
  }

  public static boolean orOP(boolean A, boolean B){
    if (A == true){
      return true;
    }
    if(B==true){
      return true;
    }
    return false;
 
  }



  public static String evenoddlength(String letters){
    if (letters.length() % 2 == 0) {
      return "Even" ;     
    }
      return "Odd";
  }


  public static int sumDouble(int x, int y){
    if (x==y){
      return (x+x)*2;
    }
    return y+y;
  }

  public static boolean makes100(int x, int y){
    if (x == 100){
      return true;
    }
    if (y==100){
      return true;
    }
    if (x+y == 100){
      return true;
    }
    return false;
  }
  public static boolean closeto100(int x){
    if(Math.abs(200-x)<=10){
      return true;
    }
    if(Math.abs(100-x)<=10){
      return true;
    }
    return false;
  }
 
}

    /* PROBLEM 1: 
        Simulate the behavior of the 'and' operator without using 'and', 'or', 
        or other logic operators. Only use conditional loops. */


  
