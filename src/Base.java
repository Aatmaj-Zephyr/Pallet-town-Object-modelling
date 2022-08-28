public class Base extends Properties {
  private int hp;
  private int speed;
  private int attack;
  private int spattack;

  public Base(int hp, int speed, int attack, int spattack) {
    // base stats
    super(hp, speed, attack, spattack);
  }
}
