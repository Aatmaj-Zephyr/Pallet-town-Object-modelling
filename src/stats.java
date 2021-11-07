public class Stats extends Properties{
    //changable stats
    
    public Stats(Properties copy_base){
        //To copy from base (stats refresh)
       refresh(copy_base);
    
    }
    
    public void refresh(Properties copy_base){
        this.hp=copy_base.get_hp();
        this.speed=copy_base.get_speed();
        this.attack=copy_base.get_attack();
        this.spattack=copy_base.get_spattack();
    }
    
}
