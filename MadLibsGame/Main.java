import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);

  String myName;
  String myEnemy;
  String myAction;
  String mySanity;
  String myInput;

  public void ask(){
    System.out.println("What is your name?");
    myName = sc.nextLine();
    

    System.out.println("What is your enemy's name?");
    myEnemy = sc.nextLine();
    
    System.out.println("What do you plan to do to your enemy?");
    myAction = sc.nextLine();
    
    System.out.println("How sane are you?");
    mySanity = sc.nextLine();

    new Main().print(myName, myEnemy, myAction, mySanity);
  }

  public void print(String me, String enemy, String action, String sanity){
    System.out.println("My name is " + me);
    System.out.println("My enemy is " + enemy);
    System.out.println("I plan to do " + action + " to my enemy because they is bad.");
    System.out.println("I am not sure if I am sane, I think I am " + sanity + " sane.");
    System.out.println("Please have mercy.");
  }
  
  public static void main(String[] args) {
    new Main().ask();
  }
}