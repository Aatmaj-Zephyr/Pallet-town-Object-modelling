import java.util.ArrayList;
public class Charizard extends Pokemon {
    Charizard(){
        this.base=new Base(110,50,20,50);
        this.stats=new Stats(base);
        //stats iterable todo
    this.name="Charizard";
    this.text="Charizard";
    this.type1 = new Fire();
    this.type2 =new Flying();
    this.My_Moves = new ArrayList<Move>(); // Create an ArrayList object 
    }
    Charizard(Pokemon PreEvolution){
        super(PreEvolution);
    }
    public Pokemon evolve() throws NoFurtherConcreteEvolution{
        throw new NoFurtherConcreteEvolution();
    }
    
    
    
}
