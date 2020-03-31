import java.util.*;
/* SFHS 2019-2020
 * Intro CS ~ Mrs. Vollucci 
 * Periods 1, 5, & 6
 *
 * Due Friday, 04/03 @ 3 PM
 * 
 * Note: You will need to add
 * the input variables & their
 * data types. You may also need
 * to change the return type for
 * the method.
 */
 
 
class Main {
  public static void main(String[] args) {

    Chef baller = new Chef("Sushi", "Pasta", false);
    System.out.println(baller.getspeciality());
    baller.promote();
    System.out.println(baller.getfavdish());
    baller.setSpeciality("french fries");
    System.out.println(baller.getspeciality());
    baller.orderUp("Pizza", 8);
    
    
    Chef dude = new Chef("Pizza", "Burger", true);
    System.out.println(dude.getspeciality());
    dude.promote();
    System.out.println(dude.getfavdish());
    dude.setSpeciality("Ramen");
    System.out.println(dude.getspeciality());
    dude.orderUp("Soup", 3);

        
    // Create one chef object here

    // Call the methods on the
    // object using dot notation

    // Create another chef object

    // Call the methods on the 2nd
    // object using dot notation
  }
}