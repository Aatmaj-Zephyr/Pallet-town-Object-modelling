import java.util.ArrayList; // import the ArrayList class

public abstract class Pokemon {
  Pokemon(Pokemon PreEvolution) {
    this();
    stats = new Stats(PreEvolution.give_stats());
  }

  Pokemon() {
    base = new Base(0, 0, 0, 0);
    stats = new Stats(base);
    this.My_Status = new Blank();
    init();
    setmoves();
  }

  protected abstract void init(); // abstract method to replace constructor.

  protected Base base; // No one must change base
  public Stats stats;
  String name;
  String text;
  int weight;
  int height;
  Type type1; // To be revisited later.
  Type type2;
  Status My_Status;
  ArrayList<Move> My_Moves = new ArrayList<Move>(); // Create an ArrayList object

  public abstract Pokemon evolve() throws NoFurtherConcreteEvolution;

  public Base give_base() {
    return base;
  }

  public Stats give_stats() {
    return stats;
  }

  public void set_name(String name) {
    this.name = name;
  }

  public void checkup() {
    this.My_Status.checkup(this);
  }

  protected abstract void setmoves();
}
