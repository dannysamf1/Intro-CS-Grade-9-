/*
 * ICS ~ Mini-Lab 5.2:
 * Iteration & Recursion Practice
 * SFHS 2019-2020
 * Mrs. Vollucci
 */

class IterRecur {
  public static void main(String[] args) {
    /* Write your own tests here to test each method after you implement it (at least 2 tests per method). */
    System.out.println(fact(5));
    System.out.println(fact(3));
    System.out.println(prod2ToNumFOR(3));
    System.out.println(prod2ToNumFOR(10));
    System.out.println(prod2ToNumWHILE(4));
    System.out.println(prod2ToNumWHILE(5));
  }
  
  public static int fact (int n) {
    if (n ==0){
      return 1;
    }
    if(n==1){
      return 1;
    }
    return (n*(fact(n-1)));
  }
  
  public static int prod2ToNumFOR (int x) {
    /* Problem 2: Write a method which calculates the product of integers from 2 to num (inclusive).
    
    Use a FOR loop for your implementation. */
    int product = 1;
    for (int i=1; i<=x; i+=1){
      product= product *i;
    }
    return product;
  }
  
  public static int prod2ToNumWHILE (int y) {
    int product = 1;
    int index = 1;
    while(index<=y){
      product = product*index;
      index +=1;
      
    }
    return product;
    
    /* Problem 3: Write a method which calculates the product of integers from 2 to num (inclusive).
    
    Use a WHILE loop for your implementation. */
  }
  
}

