import java.util.*;

class metho3{

  public static int fact(int x){
    if(x == 0 || x == 1){
      return 1;
    }
    else{
      return fact(x-1)*x;
    }
  }

  public static void main(String[] args) {
    System.out.println(fact(5));
    System.out.println(fact(10));
    System.out.println(fact(1));
    System.out.println(fact(0));
  }
}	