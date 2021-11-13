public class Burn extends Status{
    Burn(){
    this.name="Burn";
    }
     public  void checkup(Pokemon affected){
         affected.stats.hp-=10;
     }
}
