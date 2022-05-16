import java.util.Scanner;
import java.lang.Math;

public class Main {

  public static String getString (){

    int r = (int) (Math.random() * 4 + 1);

    if (r == 1){
      return "q";
    }
    else if (r == 2){
      return "w";
    }
    else if (r == 3){
      return "e";
    }
    else{
      return "r";
    }
  }

  public static int getInt(){
    int r = (int) (Math.random() * 4 + 1);

    return r;
  }

  public static void main(String[] args) {

    String password = "";
    Scanner scan = new Scanner (System.in);
    int n = scan.nextInt();
    while (n-1 > 0){
     int r = (int) (Math.random() * 2 + 0);

     if (r == 0){
       password += getString();
       continue;
     }
     password += getInt();

     n--;
    }

    System.out.println(password);

  }
}