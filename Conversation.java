import java.util.Scanner;
import java.io.*;
class Conversation {

  public static void main(String[] arguments) {
    System.out.print("How many rounds? ");
    Scanner input = new Scanner(System.in);
    int userGuess = input.nextInt(); 

    for ( int round = 0; round < r_list.size(); round++ ){
      System.out.print("say something: ");
      Scanner input2Scanner = new Scanner(System.in);
      int userGuess2 = input.nextInt();
      System.out.print(r_list.get(round) + " ");
    System.out.println();
      input.close();
    }
    }
      public String mirrorWord(String s) {
        if (s.equals("I")){
          return "you";
        } else if (s.equals("you")){
          return "I";
        } else if (s.equals("me")){
          return "you";
        } else if (s.equals("am")){
          return "are";
        } else if (s.equals("my")){
          return "your";
        } else if (s.equals("your")) {
          return "my";
        }
        return s;
  }
}
