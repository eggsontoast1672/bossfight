package src;

import java.util.Scanner;

public class StaminaFruit {
  
  private Scanner scanner = new Scanner(System.in);
  
  private int staminaRegained = 5;
  private int dosesRemaining = 3;

  public String getStaminaFruitType() {

    System.out.println("Which attack would you like to boost? (Fire, Ice, Earth): ");
    String staminaFruitType = scanner.next();

    return staminaFruitType;

  }

  public void useOnTarget(Player target) {

    if (dosesRemaining <= 0) {
      System.out.println("You are out of stamina fruit.");
      return;
    }

    // TODO Finish writing this method
    System.out.println();

  }

}
