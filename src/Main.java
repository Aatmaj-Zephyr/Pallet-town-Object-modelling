public class Main
{
	public static void main(String[] args) throws NoFurtherConcreteEvolution {
		System.out.println("Hello World");
		Pokemon a=new Charmander();
		System.out.println("I am a "+a.text);
		System.out.println(a.name);
		a.set_name("Flamy");
		System.out.println("My name is "+a.name);
	
		
		System.out.println(a.type1.text);
		System.out.println(a.stats.get_hp());
		a.stats.hp=80;
		System.out.println(a.stats.get_hp());
		System.out.println(a.base.get_hp());
		try{
		    a= a.evolve();
		   
		}
		catch(Exception NoFurtherConcreteEvolution){
		    //pass
		}
		 System.out.println("I am a "+a.text);
		System.out.println(a.name);
		System.out.println(a.type1.text);
		System.out.println(a.stats.get_hp());
		a.stats.hp=70;
		System.out.println(a.stats.get_hp());
		System.out.println(a.base.get_hp());
	    
	}
}
