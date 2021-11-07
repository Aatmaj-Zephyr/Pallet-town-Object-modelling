import java.util.ArrayList;
public class Charmander extends Pokemon {
    Charmander(){
        base=new Base(90,30,20,40);
        stats=new Stats(base);
        //stats iterable todo
    String name="Charmander";
    String text="Charmander";
    Type type1 =new Fire();
    Type type2 =new Fire();
    Pokemon PostEvolution = new Charmelon(this);
    ArrayList<Move> My_Moves = new ArrayList<Move>(); // Create an ArrayList object 
   
    }

    
    
    
}
