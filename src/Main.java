package src;

public class Main {

  public static Boss boss = new Boss();
  public static Player player = new Player();
  public static Serum serum = new Serum();

  public static boolean gameOver = false;

  public static void checkWinConditions() {

    if (boss.getHealth() <= 0) {
      System.out.println("You land the killing blow on the boss. You win!");
      gameOver = true;
      return;
    }

    if (player.getHealth() <= 0) {
      System.out.println("The hero has died. You lose.");
      gameOver = true;
      return;
    }

  }

  public static void main(String[] args) {

    while (!gameOver) {

    }

  }
  
}