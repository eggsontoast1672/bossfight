package src;

public class Main {

  public static Boss boss = new Boss();
  public static Player player = new Player();
  public static Serum serum = new Serum();

  public static boolean gameOver = false;

  public static void checkWinConditions() {

    if (boss.getHealth() <= 0) {
      System.out.println("You land the killing blow, killing the boss. You emerge, victorious.");
      gameOver = true;
      return;
    }

    if (player.getHealth() <= 0) {
      System.out.println("You are struck down by the boss. You aren't getting back up.");
      gameOver = true;
      return;
    }

  }

  public static void main(String[] args) {

    while (!gameOver) {
      // Game logic
    }

  }
  
}