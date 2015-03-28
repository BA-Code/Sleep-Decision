import java.util.Scanner;

public class Sleepy
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Are you tired?");
    String tired = keyboard.nextLine();
    tired = tired.toLowerCase();
    if (tired.equals("yes"))
    {
      System.out.println("You should go to sleep.");
    }
    else 
    {
      System.out.println("Keep on working!");
    }
  keyboard.close();
  }
}
    