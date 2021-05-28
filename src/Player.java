package src;

public class Player {
  
  private int health = 20;
  private int fireAttackStamina = 5;
  private int iceAttackStamina = 5;
  private int earthAttackStamina = 5;

  public int getHealth() { return this.health; }
  public void setHealth(int health) { this.health = health; }

  public void fireAttack(Boss target) {
    
    if (this.fireAttackStamina <= 0) {
      System.out.println("Your fire attack is out of stamina.");
      return;
    }

    System.out.println("You use a fire attack. It does 15 damage.");
    target.setHealth(target.getHealth() - 15);
    this.fireAttackStamina--;

  }

  public void iceAttack(Boss target) {
    
    if (this.iceAttackStamina <= 0) {
      System.out.println("Your ice attack is out of stamina.");
      return;
    }

    System.out.println("You use an ice attack. You do 5 damage and freeze your target.");
    target.setHealth(target.getHealth() - 5);
    target.setFrozen(true);
    this.iceAttackStamina--;

  }

  public void earthAttack(Boss target) {
    
    if (this.earthAttackStamina <= 0) {
      System.out.println("Your earth attack is out of stamina.");
      return;
    }

    System.out.println("You do 5 damage and you heal 5 health.");
    target.setHealth(target.getHealth() - 5);
    this.health += 5;
    this.earthAttackStamina--;

  }

}
