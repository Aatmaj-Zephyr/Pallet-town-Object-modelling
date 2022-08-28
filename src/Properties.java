public abstract class Properties {
  int hp;
  int speed;
  int attack;
  int spattack;

  protected Properties() {
    // pass
    // Super class must have  default constrctor in order to be called from subclass constructor.
  }

  protected Properties(int hp, int speed, int attack, int spattack) {
    this.hp = hp;
    this.speed = speed;
    this.attack = attack;
    this.spattack = spattack;
  }

  public int get_hp() {
    return hp;
  }

  public int get_speed() {
    return speed;
  }

  public int get_attack() {
    return attack;
  }

  public int get_spattack() {
    return spattack;
  }
}
