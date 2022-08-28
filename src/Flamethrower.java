public class Flamethrower extends Move {
  Flamethrower() {
    this.name = "Flamethrower"; // name of the move
    this.Move_type = new Fire(); // type of the Move_type
    this.probability = 50; // probability of the moveeffect
    this.acccuracy = 80; // accuracy of the move being hit.
    this.Damage = 80;
  }

  void effect(Pokemon opponent) { // effect of the move
    opponent.My_Status = new Burn();
  }
}
