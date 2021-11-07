import java.util.ArrayList; // import the ArrayList class
public abstract class Pokemon{
    Pokemon(Pokemon PreEvolution){
        this();
        stats=new Stats(PreEvolution.give_stats());
    }
    Pokemon(){
        base=new Base(0,0,0,0);
        stats=new Stats(base);
    }
    protected Base base; //No one must change base
    public Stats stats;
    String name;
    String text;
    int weight;
    int height;
    Type type1;//To be revisited later.
    Type type2;
    Pokemon PostEvolution;
    ArrayList<Move> My_Moves = new ArrayList<Move>(); // Create an ArrayList object
    
    public Pokemon evolve() throws NoFurtherConcreteEvolution{
        return PostEvolution;
        
    }
    public Base give_base(){
        return base;
    }
     public Stats give_stats(){
        return stats;
    }
    public void set_name(String name){
        this.name=name;
    }
}