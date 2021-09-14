import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    /* request user to enter number */
    System.out.println (" ");
    System.out.println (" ");
    System.out.println (" ");
    System.out.println("Enter a number to count down or up from:");
    /* count to the next whole number*/
    int num = s.nextInt();

    System.out.println (" ");
    System.out.println (" ");
    
    System.out.println ("Huston, we have Take off in T minus:");
/* checks if it needs to count up or down (neg or pos)*/

    if (num >= 0){
      while (num >= 0) {
      System.out.println(num);
      num--;
    }
    }
    else {
      while (num <=0){
        System.out.println(num);
        num++;
      }
    }
    System.out.println("Blast off!");
  }
}