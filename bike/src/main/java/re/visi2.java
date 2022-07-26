package re;

public class visi2 {

}

abstract class DogException extends Exception{
	public abstract void visit();
}

class dogbite extends DogException{
	String msg;
	public dogbite(String msg) {
		this.msg=msg;
		
	}
	public dogbite(Stricl stricl) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.msg;
	}
	@Override
	public void visit() {
		new handler().hand(this);
		
		
	}
	
}
class dogbark extends DogException{
	String msg;
	public dogbark(String msg) {
		this.msg=msg;
	}
		// TODO Auto-generated constructor stub
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.msg;
	}
	@Override
	public void visit() {
		// TODO Auto-generated method stub
		
	}
	
}

class handler{
	public void hand(dogbite db) {
		System.out.println("if you bidao"+db);
	}
	public void hand(dogbark dd) {
	System.out.println(dd);
	}
}
abstract class item{
	public abstract void excequte() throws DogException;
}
class Stricl extends item{

	@Override
	public void excequte() throws DogException {
		throw new dogbite("fafadfaf");
		
	}
	
}
class stone extends item{

	@Override
	public void excequte() throws DogException {
		throw new dogbark("fafadfaf");
		
	}
	
}
class Dog{
	public void play(item it) throws DogException {
		it.excequte();
	}
}
class child{
	public void playwithdog(Dog tiger,item it) {
		try {
			tiger.play(it);
		} catch (DogException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.visit();
		}
	}
}