import java.util.ArrayList;
public class Charmelon extends Pokemon {
    Charmelon(){
        this.base=new Base(110,50,20,50);
        this.stats=new Stats(base);
        //stats iterable todo
    this.name="Charmelon";
   this.text="Charmelon";
   this.type1 = new Fire();
   this.type2 =new Fire();
   this.PostEvolution = new Charmelon(this);
   this.My_Moves = new ArrayList<Move>(); // Create an ArrayList object 
    }
    Charmelon(Pokemon PreEvolution){
        super(PreEvolution);
        
    }
    
    
    
}
    
    
    
