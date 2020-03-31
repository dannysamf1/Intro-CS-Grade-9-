 /* Be sure to look at the
 * instructions on the PROG
 * REVIEW C Google Doc and to
 * watch the Prog Review C
 * Overview video first 
 */

public class Chef {

  static int numChefs;
  static String restraunt = "Cook, Serve, Delicious";

  private String favdish;
  private String speciality;
  private boolean isAssistant;

  public Chef (String fd, String s, boolean iA){
    favdish = fd;
    speciality = s;
    isAssistant = iA;
    numChefs+=1;

  }

  public String getfavdish(){
    return favdish;
  }

  public String getspeciality(){
    return speciality;
  }

  public int getNumChefs(){
    return numChefs;
  }

  public void setSpeciality(String newSpeciality){
    speciality = newSpeciality;
  System.out.println(getspeciality());
  }

  public void promote(){
    if (isAssistant == true){
      isAssistant = false;
      System.out.println("Congradulations");
    }
    else{
      System.out.println("You’re already the head chef!");

    }
  }

  public void orderUp(String Dish, int numOrders){
      System.out.println("I have "+ numOrders + " of " + Dish);
    }
  }
    // 2 class vars

    

    // 3 instance vars



    // 1 constructor

    // 3 getter methods



    // 1 setter method

    // 2 additional methods

