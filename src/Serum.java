package src;

public class Serum {

  private int healthRegained = 10;
  private int dosesRemaining = 3;

  public void useOnTarget(Player target) {
    
    if (this.dosesRemaining <= 0) {
      System.out.println("You are out of serum.");
      return;
    }

    System.out.println("You regain " + this.healthRegained + " heath");
    target.setHealth(target.getHealth() + this.healthRegained);
    this.dosesRemaining--;

  }
  
}