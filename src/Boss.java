package src;

public class Boss {
  
  private int health = 100;
  private boolean frozen = false;

  public int getHealth() { return this.health; }
  public void setHealth(int value) { this.health = value; }

  public boolean getFrozen() { return this.frozen; }
  public void setFrozen(boolean value) { this.frozen = value; }

}
