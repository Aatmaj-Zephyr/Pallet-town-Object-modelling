import java.util.ArrayList;
public class Charmelon extends Pokemon {
    Charmelon(){
        base=new Base(110,50,20,50);
        stats=new Stats(base);
        //stats iterable todo
    String name="Charmelon";
    String text="Charmelon";
    Type type1 = new Fire();
    Type type2 =new Fire();
    Pokemon PostEvolution = new Charmelon(this);
    ArrayList<Move> My_Moves = new ArrayList<Move>(); // Create an ArrayList object 
    }
    Charmelon(Pokemon PreEvolution){
        super(PreEvolution);
        
    }
    
    
    
}
    
    
    
