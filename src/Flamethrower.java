public  class Flamethrower extends move{
    //Strategy pattern
    this.name="Flamethropwer"; //name of the move
    this.Move_type=new fire(); //type of the Move_type
    this.probability=50;//probability of the moveeffect
    this.acccuracy=80;//accuracy of the move being hit.
    void effect(Pokemon opponent){//effect of the move
    opponent.status= new Burn()
        
    }
    this.Damage=80;
}
