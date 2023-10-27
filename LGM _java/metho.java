import java.util.*;

class metho{

  public static void Sum(){
    Scanner s = new Scanner(System.in);
    int x,y;
    System.out.println("Enter a number");
    x = s.nextInt();
    System.out.println("Enter the another number");
    y = s.nextInt();
    System.out.println("Sum is "+(x+y));
  }

  public static void main(String[] args) {
    Sum();
  }
}