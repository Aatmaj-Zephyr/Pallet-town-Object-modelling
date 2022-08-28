public abstract class Move {
  // Strategy pattern
  String name; // name of the move
  Type Move_type; // type of the Move_type
  int probability; // probability of the moveeffect
  int acccuracy; // accuracy of the move being hit.

  abstract void effect(Pokemon opponent); // effect of the move

  int Damage;
}
