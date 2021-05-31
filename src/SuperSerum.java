package src;

public class SuperSerum {
  
  private int healthRegained = 20;
  private int dosesRemaining = 1;

  public void useOnTarget(Player target) {
    
    if (this.dosesRemaining <= 0) {
      System.out.println("You are out of super serum.");
      return;
    }

    System.out.println("You regain " + this.healthRegained + " health.");
    target.setHealth(target.getHealth() + this.healthRegained);
    this.dosesRemaining--;

  }

}
