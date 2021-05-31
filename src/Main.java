package src;

import java.util.Scanner;

public class Main {

  public static Boss boss = new Boss();
  public static Player player = new Player();
  public static Serum serum = new Serum();
  public static Scanner scanner = new Scanner(System.in);

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

  public static void getAttackType() {
    
    System.out.print("What kind of attack do you want to use? (Fire, Ice, Earth): ");
    String attack = scanner.next();

    switch (attack.toLowerCase()) {      
      
      case "fire":
      player.fireAttack(boss);
      break;

      case "ice":
      player.iceAttack(boss);
      break;

      case "earth":
      player.earthAttack(boss);
      break;

      default:
      System.out.println("Attack type not recognized. Please try again.");
      break;

    }

  }

  public static void getItemType() {

    System.out.println("Which item do you want to use? (Serum, Super Serum, Stamina Fruit): ");
    String item = scanner.next();

    switch (item.toLowerCase()) {

      case "serum":
      serum.useOnTarget(player);
      break;

      case "super serum":
      // TODO Write super serum class
      break;

      case "stamina fruit":
      // TODO Write stamina fruit class
      break;

      default:
      System.out.println("Item not recognized. Please try again.");
      break;

    }

  }

  public static void getPlayerAction() {

    System.out.print("What would you like to do? (Attack, Item, Flee): ");
    String action = scanner.next();

    switch (action.toLowerCase()) {

      case "attack":
      getAttackType();
      break;

      case "item":
      getItemType();
      break;

      case "flee":
      // TODO Write this method!
      break;

      default:
      System.out.println("Action not recognized. Please try again.");
      break;

    }

  }

  public static void main(String[] args) {

    while (!gameOver) {
      // TODO Write game logic
    }

    while (!gameOver) {

    }

  }
  
}

// Hello ;)