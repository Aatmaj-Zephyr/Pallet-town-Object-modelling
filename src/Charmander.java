import java.util.ArrayList;
public class Charmander extends Pokemon {
    Charmander(){
        this.base=new Base(90,30,20,40);
        this.stats=new Stats(base);
        //stats iterable todo
    this.name="Charmander";
    this.text="Charmander";
    this.type1 =new Fire();
    this.type2 =new Fire();
    this.PostEvolution = new Charmelon(this);
    this.My_Moves = new ArrayList<Move>(); // Create an ArrayList object 
   
    }

    
    
    
}
