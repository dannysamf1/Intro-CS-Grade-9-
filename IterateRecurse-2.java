/* 
 * SFHS ~ 19-20
 * Intro CS ~ Mrs. Vollucci 
 * Lab 5.2: More Practice with Iteration & Recursion
 */

class IterateRecurse {
  public static void main(String[] args) {
    /* Write your own tests here. Write at least 2 tests per problem but 
     * consider that you may need to write more depending on the possible
     * outputs for a given problem. Consider factors (if it pertains) such as:
     * - Positive vs. negative numbers
     * - Even vs. odd numbers
     * - Empty String vs. String with letters
     * - Different conditions
     */

    // Problem 1 Tests
    morn_aft_eve(3, "Daniel");
    // Problem 2 Tests
    System.out.println(sum_div3_for(1,10));
    // Problem 3 Tests

    // Problem 4 Tests

    // Problem 5 Tests

    // Problem 6 Tests

  }
  
  public static void morn_aft_eve (int i, String z) {
    if (i==1){
      System.out.println("Good Morning " + z);
    }
    else if (i==2){
      System.out.println("Good Afternoon " + z);
    }
    else{
      System.out.println("Good Evening " + z);
    }
    /* PROBLEM 1 (WARM-UP - Conditionals):
    Write a method which prints an appropriate greeting with 
    the person's name based on the time of day.
    
    When num is 1, it is morning.
    If num is 2, then it is afternoon.
    Otherwise, it is evening.
    
    Change the return type (if needed) & add input(s) to the method.
    
    Ex: "Yoshi", 1 -> "Good morning, Yoshi"
    
    Use an 'else if' in your implementation. */
  }
  
  public static int sum_div3_for (int y, int z) {
    int s = 0;
    for(int i = y; i < z; i+=1){
      if (i%3 == 0){
        s +=i;
      }
    }
     return s;
    /* PROBLEM 2:
    Write a method which returns the sum of the integers 
    divisible by 3 from START to END (inclusive).
    
    Change the return type (if needed) & add input(s) to the method.
    
    Ex: 1, 10 -> 18 (Sum of: 3 + 6 + 9)
    
    You must use a FOR loop in your implementation.
    */ 
  }
  
  public static void sum_odd_while () {
    /* PROBLEM 3:
    Write a method which returns the sum of the odd numbers
    from START to END (inclusive).
    
    Change the return type (if needed) & add input(s) to the method.
    
    Ex: 1, 7 -> 16 (Sum of: 1 + 3 + 5 + 7)
    
    You must use a WHILE loop in your implementation.
    */
  }
  
  public static void count_x() {
    /* PROBLEM 4: 
    Write a method which returns the number of occurrences of some character x in some string z.
    
    Ex: "hurray says hannah", 'h' -> 3
    
    Change the return type (if needed) & add input(s) to the method.
    
    You must use a WHILE loop in your implementation.
    
    Hint: Use length() & charAt(). */
  }
    
  public static void pattern_AB () {
    /* PROBLEM 5:
    Write a method which takes two strings a,b and weaves 
    them together a certain number num times. Return the result of weaving them together.
    
    EX: "aa", "bc", 3 -> "aabcaabcaabc" 
    
    Change the return type (if needed) & add input(s) to the method.
    
    Use a FOR loop in your implementation. */
  }
  
  public static void mult_pos() {
    /* PROBLEM 6:
    Write a method which multiplies two positive integers x,y recursively & returns their product. 
    
    Change the return type (if needed) & add input(s) to the method.
    
    You can only use addition & comparison operators. */
  }
  
  /* If you finish early, implement mult_pos so that it works for 
  negative numbers too. */
}