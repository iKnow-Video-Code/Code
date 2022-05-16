import java.util.Scanner; //ability to allow user input
import java.lang.Math; //use random method of this class
public class Main {
  public static void main(String[] args) {
  Scanner scan = new Scanner (System.in);
  String choice = scan.nextLine();
  int n = 0;

  while (n == 0){

  int random = (int) (Math.random() * 3 + 0);

    System.out.println("User input: " + choice);
  if(random == 0){
    System.out.println("Computer Choice: Rock");
  }
  else if (random == 1){
    System.out.println("Computer Choice: Paper");
  }
  else{
    System.out.println("Computer Choice: Scissors");
  }

    if (choice.equals("Rock")){
      if (random == 0){
        System.out.println("Tie!");
      }
      else if (random == 1){
        System.out.println("You lose!");
      }
      else{
        System.out.println("You win!!! :)");
      }
    }

    if (choice.equals ("Scissors")){

      if (random == 0){
        System.out.println("You lose!");
      }
      else if (random == 1){
        System.out.println("You win!!! :)");
      }
      else{
        System.out.println("Tie!");
      }     
    }

    if (choice.equals("Paper")){
      if (random == 0){
        System.out.println("You win!!! :)))");
      }
      else if (random == 1){
        System.out.println("Tie!");
      }
      else{
        System.out.println("You lose!");
      }
    }
    n = 1;
  }

    System.out.println("You have completed the game! If you want to restart, press Run!");
//woops
  }
}