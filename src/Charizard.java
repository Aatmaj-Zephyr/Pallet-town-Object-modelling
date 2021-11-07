import java.util.ArrayList;
public class Charizard extends Pokemon {
    Charizard(){
        base=new Base(110,50,20,50);
        stats=new Stats(base);
        //stats iterable todo
    String name="Charizard";
    String text="Charizard";
    Type type1 = new Fire();
    Type type2 =new Flying();
    ArrayList<Move> My_Moves = new ArrayList<Move>(); // Create an ArrayList object 
    }
    Charizard(Pokemon PreEvolution){
        super(PreEvolution);
    }
    public Pokemon evolve() throws NoFurtherConcreteEvolution{
        throw new NoFurtherConcreteEvolution();
    }
    
    
    
}
